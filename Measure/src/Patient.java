/** Name created at etc
 * 
 */

/**This is the class for Patient and it implements the interface Measurable
 * The class has variables of private type which are String name, int age, double weight;
 */
public class Patient implements Measurable {
	private String name;
	private int age;
	private double weight;
	
/** The constructor for Patient takes three parameters
 * 	@param String Name
 *  @param int Age
 *  @param double Weight
 */
	public Patient(String Name, int Age, double Weight){
		this.name = Name;
		this.age = Age;
		this.weight = Weight;
	}
/** This is the getName method.
 * @return name
 */

	public String getName() {
		return this.name;
	}
/** This is the getName method.
 * @param String name
*/
	public void setName(String name) {
		this.name = name;
	}
/** This is the getMeasure method.
 * @return this.weight
 */
	public double getMeasure(){
		return this.weight;
	}
}
