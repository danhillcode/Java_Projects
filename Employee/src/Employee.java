//Improvement - The improvment in this code was the use of get method
//call when using the toString method
//it should be like this.      this.getFirstName()




/**
 * @author  Daniel James Hill <danhilltravel@hotmail.co.uk>
 * @version 1.0
*  @since   2016-10-01
*/

/**
 * Employee.java for task sheet 2 - Exercise 1 The following class acts to
 * formulate the employees in a business. It requires a firstname, surname and a
 * year of joining.
 */

public class Employee {

	public String firstname;
	public String surname;
	public int yearOfJoining;

	/**
	 * This is the class constructor which declares the employee type along with
	 * characteristics. This constructor has three parameters:
	 *
	 * @param Firstname
	 *            This is the first name of the employee.
	 * @param Surname
	 *            This is the surname of the employee.
	 * @param YearofJoining
	 *            This is the year the employee joined the company. to set the
	 *            first name, surname and year of joining for the employee.
	 */
	public Employee(String Firstname, String Surname, int YearofJoining) {

		this.firstname = Firstname;
		this.surname = Surname;
		this.yearOfJoining = YearofJoining;

	}

	/**
	 * This is a get method to which reads for the first name of the employee.
	 *
	 * @return firstname of the employee
	 */
	public String getFirstName() {
		return firstname;
	}

	/**
	 * This is a get method to which reads for the surname of the employee.
	 *
	 * @return surname of the employee
	 */
	public String getSurname() {
		return surname;
	}

	/*
	 * This is a get method to which reads for the year of joining of the
	 * employee.
	 *
	 * @return yearOfJoining of the employee
	 */
	public int getYearOfJoining() {
		return yearOfJoining;
	}

	/**
	 * This is a set method to which set a new surname for the employee.
	 */
	public void setSurname(String newSurname) {
		surname = newSurname;
	}

	/**
	 * This is a set method to which set a new firstname for the employee.
	 */
	public void setFirstName(String newFirstname) {
		firstname = newFirstname;
	}

	/**
	 * This is a set method to which set a new yearOfJoining for the employee.
	 */
	public void setYearOfJoining(int newYear) {
		yearOfJoining = newYear;
	}

	/**
	 * This is a toString method allows the firstname,surname and year of
	 * joining of the employee.
	 */
	public String toString() {
		return this.getFirstName() + " " + this.getSurname() + " " + this.getYearOfJoining();
	}

	/**
	 * This is a main method which allows the employee class to be instanciated
	 * and all of the methods created above to be called including the
	 * getters,setters and toString methods.
	 */
	public static void main(String[] args) {
		Employee emp1 = new Employee("Dave", "Smith", 40);
		System.out.println( emp1.toString());
		
	}

}
