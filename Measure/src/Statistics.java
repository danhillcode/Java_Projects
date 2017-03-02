import java.util.ArrayList;
/** Name created at etc
 * 
 */

/**This is the class for Statistics and it implements the interface Measurable
 * The class has variables of private type which are String name, integer age, double weight;
 * It has two methods called public static double mean(ArrayList<Measurable> list) and
 * public static double standardDeviation(ArrayList<Measurable> list)
 */

public class Statistics {	

	/** This is the method mean which returns type double
	 * The method uses a for loop which iterates through the list ArrayList and sums all the elements 
	 * The sum is then divided by the list.size() which is the number of elements resulting in the mean.
	 * @param ArrayList list
	 * @return double mean
	 */
	public static double mean(ArrayList<Measurable> list) {
		double sum = 0;
		double mean = 0;
		for(int i = 0; i < list.size() ; i++)
		{
			sum += list.get(i).getMeasure();
		}
		mean = sum / list.size();
		return mean;
	}
	
	/** This is the method standardDeviation which returns type double
	 * This method calls the mean method which calculates the mean of the elements in the list parameter
	 * The method then calculates the standard deviation of the elements.
	 * @param list
	 * @return double SD (Standard deviation)
	 */
	public static double standardDeviation(ArrayList<Measurable> list){
	/** 
	 * Initialize the variables of mean of the list and SD	
	 */
		double mean = Statistics.mean(list);
		double SD = 0;
		
	/** The instance variables standard and sum are initialised which are used in the for loop. The standard
	 * is used as an intermediary when calculating the standard deviation. The sum is used to sum all elements.
	 * In the for loop each number subtracts the Mean and square the result.
	*/	
		double standard = 0;
		double sum = 0;
		for(int i = 0; i < list.size(); i++){
		
			standard = list.get(i).getMeasure() - mean;
			standard = standard * standard;
			sum += standard;
		}
	/**Then work out the mean of those squared differences. Take the square root of the result 
	* and it is assigned to SD which is returned.
	*/ 
		SD = Math.sqrt(sum / list.size());
		return SD;
	}
	
	/**This is the main method which is used to call the methods created above.
	 * @param args
	 */
	
	public static double standardDeviation2(ArrayList<Measurable> a){
		
		double sum = 0;
		for (Measurable e1 :a){
		  sum = (e1.getMeasure() - mean(a)) * (e1.getMeasure() - mean(a));
		}
		return Math.sqrt(sum/a.size());
		}
	
	
	
	public static void main(String [] args)
	{
		ArrayList<Measurable> list2 = new ArrayList<Measurable>();
		list2.add(1.0);
		System.out.println(standardDeviation2(list2));
		System.out.println();
		
	}
}
