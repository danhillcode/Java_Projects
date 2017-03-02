import java.util.ArrayList;
/** Name created at etc
 * 
 */

/**This is the public class ExamQuestionSimpleChoice. 
 * The class has variables which are private type which include ArrayList<String> possibleAnswers and 
 * integer answer. Also, the inherited variables from the super class questionText, maximalMark.
 */

public class ExamQuestionSimpleChoice extends ExamQuestion {
	
	private ArrayList<String> possibleAnswers = new ArrayList <String>();
	private int answer;

/**This is the constructor for the ExamQuestionNumeric class.
 * @param questionText
 * @param maximalMark
 * @param possibleAnswers
 * @param answer	
*/		
	public ExamQuestionSimpleChoice(String questionText, int maximalMark, ArrayList <String> possibleAnswers, int answer){
		super(questionText, maximalMark);
		this.possibleAnswers = possibleAnswers;
		this.answer = answer;
	}
	
/** This is the toString method.
 * @return super.toString from ExamQuestion
 * @return possibleAnswers
 * @return answer
*/	
	@Override
	public String toString() {
		return "ExamQuestionSimpleChoice [possibleAnswers=" + possibleAnswers + ", answer=" + answer
				+ ", getQuestionText()=" + getQuestionText() + ", getMaximalMark()=" + getMaximalMark()
				+ ", toString()=" + super.toString() + ", getClass()=" + getClass() + "]";
	}
	
/**This is mark method which returns the maximal mark.of the question.	
 * @param value
 * @return maximalMark if answer is correct || 0 if answer is incorrect.
*/
	public int mark(int value){
		//need to find the position of the correct answer
		//if value == i of correct answer 
		//correct answer == possibleAnswers.get(i)
		//starts at 1 as humans do
		//do I need this??????
		/*int arrayAnswer = 0;
		int num = 0;
		possibleAnswers.add(0,"0");
		/*for (int i=0; i < possibleAnswers.size(); i++ ){
			 
			 arrayAnswer = Integer.parseInt(possibleAnswers.get(i));
			 num = i;
			

			 //System.out.println(arrayAnswer);
			 System.out.println(Integer.parseInt(possibleAnswers.get(1)));
		}
		*/
		
		if (this.answer == value){
			return this.getMaximalMark();
		}
		//sSystem.out.println(Integer.parseInt(possibleAnswers.get(value)));
		return 0;
	}

	
	
	
}
