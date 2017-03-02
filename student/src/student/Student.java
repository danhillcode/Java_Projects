package student;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Student {

	private String name;
	private double average;

	public Student(String name, double average) {

		this.name = name;
		
		if (average > 0.0)
			if (average <= 100.0)
		this.average = average;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getAverage() {
		return average;
	}

	public void setAverage(double average) {
		this.average = average;

		if (average <= 100.0)
	this.average = average;
	}
	
	public String toString(){
		return "The student is " + "\n" + name;
	}
	
	

	public static void main (String[] args)
	{
		Student account1 = new Student("John", 18.0);
		double go = account1.getAverage();
		System.out.println(go);
		System.out.println(account1);
	}
}
