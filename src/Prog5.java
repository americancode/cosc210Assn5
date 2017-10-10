
/**
 * COSC 210-001 Assignment 5
 * Prog5.java
 * 
 * This Program reads employee information from a file and places
 * a corresponding Employee object into an array. Finally, it prints a 
 * report containing the annual total, average salary, and number of employees
 * It also prints all the employees as well
 * 
 * @author Nathaniel Churchill
 * 
 * 10/24/16 
 */

//Import Statements
import java.util.*;
import java.io.*;

public class Prog5 {

	public static void main(String[] args) {
		//open the file
		Scanner fileIn = null;
		try {
			fileIn = new Scanner(new File("employees.txt"));
		}catch (FileNotFoundException e){
			System.out.println("File Not Found");
		}
		
		
		Employee[] emps = new Employee[20];
		int numberOfEmployees = 0;

		try{
			while (fileIn.hasNextLine()){
				emps[numberOfEmployees] = new Employee(fileIn.next(), 
						fileIn.next(), fileIn.next(), fileIn.nextDouble());
				numberOfEmployees++;
			}
		} catch (Exception e){
			System.out.println("File input Error: " + e);
		}
		
		
		
		
		
		
		
		//output
		System.out.println("Churchill Corportation Summary\n");
	
		System.out.printf("%-30s%12d\n%-30s%15.2f\n%-30s%15.2f\n\n\n","Number of Employees:", 
				numberOfEmployees, "Average Salary:", 
				averageSalary(emps, numberOfEmployees),
				"Annual Total:", total(emps, numberOfEmployees));
		
		System.out.printf("%-30s%5s%15s\n", "Name", "Rank", "Salary");
		
		//looping through the array of employee objects to print data
		for (int counter = 0; counter < numberOfEmployees; counter++){
			System.out.printf("%-30s%5s%15.2f\n", emps[counter].formatName(),
					emps[counter].getRank(), emps[counter].getSalary());
		}
		//close the File
		fileIn.close();
	}
	
	
	/**
	 * This method returns the average salary for an array
	 * of Employees
	 * @param emps, a reference to an Employee object
	 * @param num, the number of Employees in the array
	 * @return double, the average salary of all Employees
	 */
	public static double averageSalary(Employee[] emps, int num){
		double total = 0;
		for(int counter = 0; counter < num; counter++){
			total += emps[counter].getSalary();
		}
		return total/num;
	}
	
	
	/**
	 * This method returns the total salary for an array
	 * of Employees
	 * @param emps  
	 * @param num, the number of Employees in the array
	 * @return double, the total salary from all Employees
	 */
	public static double total(Employee[] emps, int num){
		double total = 0;
		for(int counter = 0; counter < num; counter++){
			total += emps[counter].getSalary();
		}
		return total;
	}

}
