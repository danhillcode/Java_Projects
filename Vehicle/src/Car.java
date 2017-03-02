/** Name created at etc
 * 
 */

/**This is the public class for Car which extends/inherits from the class Vehicle. 
 * The class has variable a private type which is double fuelConsumption.
 * The variables also include those from the superclass maxSpeed and maxPassengers.
 */
public class Car extends Vehicle {

	private double fuelConsumption;
	/**This is the constructor for the Vehicle class which inherits the variables from Car. 	
	 * @param maxSpeed
	 * @param maxPassengers
	 * @param fuelConsumption
	 */
	public Car(double maxSpeed, int maxPassengers, double fuelConsumption){
	super (maxSpeed, maxPassengers);
	this.fuelConsumption = fuelConsumption;
	}
/** This is the getFuelConsumption method.
 * @return fuelConsumption
*/	
	public double getFuelConsumption() {
		return fuelConsumption;
	}

/** This is the setFuelConsumption method.
 * @param fuelConsumption
*/	
	public void setFuelConsumption(double fuelConsumption) {
		this.fuelConsumption = fuelConsumption;
	}

/** This is the toString method.
 * @return super.toString from the Car class
 * @return fuelConsumption
*/	
	@Override
	public String toString() {
		return super.toString() + "Its fuel consumption is "  + fuelConsumption + "l/100km.";
	}	
}
