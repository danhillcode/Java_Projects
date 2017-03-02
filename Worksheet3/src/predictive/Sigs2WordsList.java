package predictive;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Set;

//Compare the time taken to complete the execution of Sigs2WordsList and Sigs2- WordsProto with the same large input(s). 
//Is it possible to make the time difference between Sigs2WordsList and Sigs2WordsProto noticeable? Make a note of the data you 
	//	use and your timing results.

//Sigs2WordsList 
//Sigs2WordsProto

public class Sigs2WordsList {
	

    public static void main(String[] args) {
        ListDictionary ld = null;
        try {
            ld = new ListDictionary("words.txt", null);
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (String s : args){
            Set<String> wordList = ld.signatureToWords(s);
            String formattedString = String.format("%s: %s", s, wordList.toString());

            System.out.println(formattedString);

        }
    }
}
    
