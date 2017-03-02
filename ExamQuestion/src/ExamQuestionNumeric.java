/** Name created at etc
 * 
 */

/**This is the public class ExamQuestionNumeric. 
 * The class has variables which are private type which include int answer and the inherited variables
 * from the super class questionText, maximalMark.
 */
public class ExamQuestionNumeric extends ExamQuestion {
	
	private int answer;
	//need to make a constructor and then methods see sample code super
	
/**This is the constructor for the ExamQuestionNumeric class.
 * @param questionText
 * @param maximalMark
 * @param answer	
*/	
	public ExamQuestionNumeric(String questionText, int maximalMark, int answer){
		super(questionText, maximalMark);
		this.answer = answer;
	}
	
/**This is mark method which returns the maximal mark if the value parameter input is equal to the answer
 * of the question.	
 * @param value
 * @return maximalMark if answer is correct || 0 if answer is incorrect
 */
	public int mark(int value){
		if (value == answer){
			return this.getMaximalMark();
		}
		return 0;//full marks if the answer is correct and 0 otherwise.
	}
/** This is the toString method.
 * @return super.toString from ExamQuestion
 * @return answer
*/	
	@Override
	public String toString() {
		return "ExamQuestionNumeric [answer=" + answer + ", getQuestionText()=" + getQuestionText()
				+ ", getMaximalMark()=" + getMaximalMark() + ", toString()=" + super.toString() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + "]";
	}
}