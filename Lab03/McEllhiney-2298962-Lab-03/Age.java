/*
 * File Name:  Age.java
 * Author: Elise McEllhiney
 * Assignment:   EECS-168 Lab 3
 * Description:  This program will tell the user if they are a baby, toddler, child, teenager, adult, or senior citizen based on their age.
 * Date: Feb. 9, 2012
 *
 ---------------------------------------------------------------------------- */
import java.util.Scanner;
public class Age {
	public static void main(String[] args){
		//Declare variables
		double age = 0.0;
		//Import scanner
		Scanner input=new Scanner(System.in);
		//Request input
		System.out.println("Enter your age:");
		//Input age value
		age = input.nextDouble();
		//Determine classification
		if (age < 1.0)
			System.out.println("You are a baby");
		else if (age < 3.0)
			System.out.println("You are a toddler");
		else if (age < 13.0)
			System.out.println("You are a child");
		else if (age < 20.0)
			System.out.println("You are a teenager");
		else if (age < 65.0)
			System.out.println("You are a adult");
		else
			System.out.println("You are a senior citizen");
	}
	

}
