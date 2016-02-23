package main;
// Code starts
import java.util.Scanner;
import java.math.*;
public class QBrating {
	public static void main(String[] args) {
		//getting inputs
		double[] vars = getInputs(); 
		
		//Variables
		double att = vars[0];
		double comp = vars[1];
		double yds = vars[2];
		double td = vars[3];
		double intr = vars[4];

		//Calculations
		double a = ((comp/att) - .3) * 5;
		double b = ((yds/att) - 3) * .25;
		double c = (td/att) * 20;
		double d = 2.375 - ((intr/att) * 25);
		double passer = ((a + b + c + d)/6) * 100;

		
		//Printing
		System.out.println("The passer rating is " + passer);
	}
	/*
	 * Helper methods for inputs
	 */
	public static double getArg() { //Getting inputs for main function
		Scanner input = new Scanner(System.in);
		double var = input.nextDouble(); // convert to short
		//input.close();
		return var; //return the short
	}
	public static double[] getInputs() { //Inputs and making array
		double[] vals = new double[6];
		System.out.println("Enter number of passing attempts or ATTs:");
		vals[0] = getArg();
		System.out.println("Enter number of completions or COMPs:");
		vals[1] = getArg();
		System.out.println("Enter passing yards or YDS");
		vals[2] = getArg();
		System.out.println("Enter touchdown passes or TDs:");
		vals[3] = getArg();
		System.out.println("Enter interceptions or INTs:");
		vals[4] = getArg();
		return vals;
	}
}