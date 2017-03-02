import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;

public class ExamQuestionMultipleChoice extends ExamQuestion {

    //private String questionText;
   // private int maximalMark;
    private ArrayList<String> possibleAnswers = new ArrayList <String>();
    private ArrayList<Integer> correctAnswers = new ArrayList <Integer>();
    //private ArrayList<Integer> givenAnswers = new ArrayList <Integer>();
    
    public ExamQuestionMultipleChoice(String questionText, int maximalMark, ArrayList <String> possibleAnswers, ArrayList <Integer> correctAnswers ){
        super(questionText, maximalMark);
        this.possibleAnswers = possibleAnswers;
        this.correctAnswers = correctAnswers;
        
    }
    
    public int mark(ArrayList<Integer> givenAnswers){
        double maximalPoints = 0.0;
        double correctAnswer = 0.0;
        double wrongAnswer = 0.0;
       // double totalCorrectAnswers = correctAnswers.size();
        
        for(int i = 0; i < givenAnswers.size(); i++){
            
            if (correctAnswers.contains(givenAnswers.get(i))){
            correctAnswer = correctAnswer + 1;} 
            else { wrongAnswer = wrongAnswer + 1;
            }
            

        }
       // System.out.println((double)((correctAnswer - wrongAnswer)/correctAnswer));
        maximalPoints = ((correctAnswer - wrongAnswer)/correctAnswer) * (getMaximalMark());
        
        if (maximalPoints < 0){
        return 0;}
       // System.out.println(maximalMark);
        return (int) maximalPoints;

    }
    
    @Override
    public String toString() {
        return "ExamQuestionMultipleChoice [questionText=" + getQuestionText() + ", maximalMark=" + getMaximalMark()
                + ", possibleAnswers=" + possibleAnswers + ", correctAnswers=" + correctAnswers + ", getQuestionText()="
                + getQuestionText() + ", getMaximalMark()=" + getMaximalMark() + ", toString()=" + super.toString()
                + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
    }
    
   
    /*
        //For instance, if the solutions to "x*x = 4" are to be found, 
        //it may be possible to offer the values -2, 0, 2, and 3 as possible
        
        //answers to an ArrayList<String> with
        ArrayList<String> possibleAnswers = new ArrayList<String>(); 
        //and
        possibleAnswers.add("-2"); possibleAnswers.add("0"); possibleAnswers.add("2");possibleAnswers.add("3");
        //the correct answers to the same question would be represented in an ArrayList<Integer> with
        ArrayList<Integer> correctAnswers = new ArrayList<Integer>(); 
        //and 
        correctAnswers.add(1); correctAnswers.add(3);
        //. That is, with 
        ExamQuestionMultipleChoice question = new ExamQuestionMultipleChoice("x*x = 4", 10, possibleAnswers, correctAnswers);
        //we should get from 
        //question.mark(givenAnswers); 
        //with an ArrayList<Integer> givenAnswers as indicated the following marks:
        
    }
    
    /*Write a method public int mark(ArrayList<Integer> answersProvided) in the subclass 
     check answers provided against the correctAnswers return maximalMark
     * points = N0 of correct answers - number of incorrect answers returns maximal points (not <0)
     
    the points finding the difference between the number of correct answers and the number of 
    incorrect answers to the maximal points (but not returning less than 0). 
    */
    
}

//Furthermore, write a
//suitable public String toString() method, making use of inheritance as far as possible.