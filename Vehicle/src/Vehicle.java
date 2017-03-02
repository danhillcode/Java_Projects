/** Name created at etc
 * 
 */

/**This is the public class for Vehicle. 
 * The class has variables of private type which are double maxSpeed and integer maxPassengers.
 */
public class Vehicle {
	private double maxSpeed;
	private int maxPassengers;
	
/**
 * This is the constructor for the class Vehicle.	
 * @param maxSpeed
 * @param maxPassengers
 */
	public Vehicle(double maxSpeed, int maxPassengers){
		this.maxSpeed = maxSpeed;
		this.maxPassengers = maxPassengers;
	}
	
/** This is the maxSpeed method.
 * @return maxSpeed
 */
	public double getMaxSpeed() {
		return maxSpeed;
	}

/** This is the setMaxSpeed method.
 * @param maxSpeed
 */
	public void setMaxSpeed(double maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

/** This is the getMaxSpeed method.
 * @return maxPassengers
 */
	public int getMaxPassengers() {
		return maxPassengers;
	}

/** This is the setMaxPassengers method.
 * @param maxPassengers
 */
	public void setMaxPassengers(int maxPassengers) {
		this.maxPassengers = maxPassengers;
	}

/** This is the String toString method for this class.
 * @return String containing maxSpeed and maxPassengers
 * The if statement within the toString method returns 'passenger' if maxPassengers are less than or equal to one.
 * and return 'passengers' if the maxPassengers are greater than one. 
 */
	@Override
	public String toString() {
		if (maxPassengers <= 1){
		return "The vehicle has a maximal speed of" + maxSpeed + "km/h. It carries" + maxPassengers + "passenger.";
		}
			return "The vehicle has a maximal speed of" + maxSpeed + "km/h. It carries" + maxPassengers + "passengers.";	
		}
}
