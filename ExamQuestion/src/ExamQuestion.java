/** Name created at etc
 * 
 */

/**This is the public class ExamQuestion. 
 * The class has variables which are private type which include String questionText and int maximalMark.
 */
public class ExamQuestion {

	private String questionText;
	private int maximalMark;
	
/**This is the constructor for the ExamQuestion class.
 * @param questionText
 * @param maximalMark	
*/
	public ExamQuestion(String questionText, int maximalMark){
		this.questionText = questionText;
		this.maximalMark = maximalMark;
	}

/** This is the getQuestionText method.
 * @return questionText
*/	
	public String getQuestionText() {
		return questionText;
	}

/** This is the setQuestionText method.
 * @param questionText
*/	
	public void setQuestionText(String questionText) {
		this.questionText = questionText;
	}
	
/** This is the getMaximalMark method.
 * @return maximalMark
*/	
	public int getMaximalMark() {
		return maximalMark;
	}

/** This is the setMaximalMark method.
 * @param maximalMark
*/	
	public void setMaximalMark(int maximalMark) {
		this.maximalMark = maximalMark;
	}
/** This is the toString method.
 * @return maximalMark
 * @return questionText
*/	
	@Override
	public String toString() {
		return "Question (maximal mark: "+ maximalMark + ") " + questionText + "?.";
	}
}
