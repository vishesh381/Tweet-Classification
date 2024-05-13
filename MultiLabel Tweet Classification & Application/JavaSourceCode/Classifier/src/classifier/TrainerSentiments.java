package classifier;

import com.aliasi.classify.Classification;
import com.aliasi.classify.Classified;
import com.aliasi.classify.DynamicLMClassifier;
import com.aliasi.classify.LMClassifier;
import com.aliasi.corpus.ObjectHandler;
import com.aliasi.util.AbstractExternalizable;
import com.aliasi.util.Compilable;
import com.aliasi.util.Files;
import java.io.File;
import java.io.IOException;


public class TrainerSentiments {
    private String charset;
    private String trainDirectory;
    private String outFile;

    public TrainerSentiments() {
        charset = Config.charset;
        trainDirectory = Config.trainDirectory;
        outFile = Config.classifierPath;
    }

    public TrainerSentiments(String charset, String trainDirectory, String outFile) {
        this.charset = charset;
        this.trainDirectory = trainDirectory;
        this.outFile = outFile;
    }

    public void Train() throws IOException, ClassNotFoundException {
        File trainDir;
        String[] categories;
        LMClassifier clazz;
        trainDir = new File(this.trainDirectory);
        categories = trainDir.list();
        int nGram = 7; //the nGram level, any value between 7 and 12 works
        clazz = DynamicLMClassifier.createNGramProcess(categories, nGram);
            /*Construct a dynamic classifier over the specified categories, using process character n-gram models of the specified order. 
            categories - Categories used for classification.
            maxCharNGram - Maximum length of character sequence counted in model. 
            */
        
        System.out.println("This is Sentiment trainer");
        for  (int i = 0; i < categories.length; ++i) {
            String category = categories[i];
            Classification classification = new Classification(category);
            File file = new File(trainDir, categories[i]);
            File[] trainFiles = file.listFiles();
            for (int j = 0; j < trainFiles.length; ++j) {
                File trainFile = trainFiles[j];
                String review = Files.readFromFile(trainFile, this.charset);
                Classified classified = new Classified(review, classification);
                ((ObjectHandler) clazz).handle(classified);
            }
        }
        /*
        This method runs through the categories, of which there are two in this demo. 
        It then creates a directory using the polarity data directory and the name of the category.
        This only works for this demo because the data is organized into directories by category. 
        Then, the potential training files are listed and iterated. 
        For each training file, a test is done to see if it is a training file. 
        If it is, then the text is read from the file using the LingPipe utility method Files.readFromFile, 
        and then used to train the classifier for the specified category. 
        */
        AbstractExternalizable.compileTo((Compilable) clazz, new File(this.outFile));
    }
}
