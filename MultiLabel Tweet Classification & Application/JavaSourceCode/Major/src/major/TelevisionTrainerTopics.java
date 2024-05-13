package major;

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


public class TelevisionTrainerTopics {
    private String charset2;
    private String trainDirectory2;
    private String outFile2;

    public TelevisionTrainerTopics() {
        charset2 = TelevisionConfig.charset2;
        trainDirectory2 = TelevisionConfig.trainDirectory2;
        outFile2 = TelevisionConfig.classifierPath2;
    }

    public TelevisionTrainerTopics(String charset, String trainDirectory, String outFile) {
        this.charset2 = charset2;
        this.trainDirectory2 = trainDirectory2;
        this.outFile2 = outFile2;
    }

    public void Train() throws IOException, ClassNotFoundException {
        File trainDir2;
        String[] categories2;
        LMClassifier clazz2;
        trainDir2 = new File(this.trainDirectory2);
        categories2 = trainDir2.list();
        int nGram = 7; //the nGram level, any value between 7 and 12 works
        clazz2 = DynamicLMClassifier.createNGramProcess(categories2, nGram);
            /*Construct a dynamic classifier over the specified categories, using process character n-gram models of the specified order. 
            categories - Categories used for classification.
            maxCharNGram - Maximum length of character sequence counted in model. 
            */
         System.out.println("This is Television Topic trainer");

        for  (int i = 0; i < categories2.length; ++i) {
            String category = categories2[i];
            Classification classification = new Classification(category);
            File file = new File(trainDir2, categories2[i]);
            File[] trainFiles = file.listFiles();
            for (int j = 0; j < trainFiles.length; ++j) {
                File trainFile = trainFiles[j];
                String review = Files.readFromFile(trainFile, this.charset2);
                Classified classified = new Classified(review, classification);
                ((ObjectHandler) clazz2).handle(classified);
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
        AbstractExternalizable.compileTo((Compilable) clazz2, new File(this.outFile2));
    }
}
