/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package major;

import com.aliasi.classify.ConditionalClassification;
import com.aliasi.classify.LMClassifier;
import com.aliasi.util.AbstractExternalizable;
import java.io.File;
import java.io.IOException;

/**
 *
 * @author Pranav Jain
 */
public class MobileTopicClassifier {
     String[] categories;  
    LMClassifier class1;  
    /*A joint classifier for character sequences classifying over a specified set of categories,
    with a multivariate distribution over those categories and a language model per category. 
    */
    public MobileTopicClassifier() {  
    try {  
       //class1= (LMClassifier) AbstractExternalizable.readObject(new File(Config.classifierPath));
       /*This is just a convenience method that creates a file input stream, 
       buffers it, wraps it in an object input stream and reads an object from the input. 
       It always makes sure to close all of the stream, even if exceptions are raised. 
       */
       class1= (LMClassifier) AbstractExternalizable.readObject(new File("MobileclassifierTopic.txt"));
       categories = class1.categories();  
    }  
    catch (ClassNotFoundException | IOException e) {  
    }  
    }  
    public String classify(String text) {  
    ConditionalClassification classification = class1.classify(text);  //Returns the n-best conditional probability classification for the specified input. 
    return classification.bestCategory();      //Returns the best-scoring category. 
    } 
}
