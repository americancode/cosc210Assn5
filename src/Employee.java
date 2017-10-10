/**
 * COSC 210-001 Assignment 5
 * Employee.java 
 * 
 * This class represents one employee, with first
 *  name, last name rank, and salary
 * 
 * 
 * @author Nathaniel Churchill
 *
 */
public class Employee {
	//attributes
	private String fName;
	private String lName;
	private String rank;
	private double salary;

	//Constructor
	public Employee(String fName, String lName, 
			String rank, double salary) {
		super();
		this.fName = fName;
		this.lName = lName;
		this.rank = rank;
		this.salary = salary;
	}
	
	//getters
	public String getRank() {
		return rank;
	}

	public double getSalary() {
		return salary;
	}


	//custom methods
	/**
	 * This method returns a String in the "Last, First" format
	 * @return String 
	 *
	 */
	public String formatName(){
		return lName + ", " + fName;
	}
}
