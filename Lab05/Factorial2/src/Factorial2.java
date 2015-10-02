/* -----------------------------------------------------------------------------
 *
 * File Name:  Factorial.java
 * Author: Elise McEllhiney
 * Assignment:   EECS-168 Lab05
 * Description:  This program will compute the factorial of a number.
 * Date: Feb 23, 2012
 *
 ---------------------------------------------------------------------------- */
import java.util.Scanner;
public class Factorial2 {
	public static void main(String[] args){
		//input
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a number to compute factorial:");
		int A = input.nextInt();
		int factorial=1;
		//negative check
		while (A < 0){
			System.out.println("Please input a non-negative number:");
			A = input.nextInt();
		}
		//finding factorial
		if (A > 0){
			for (int cnt = 1; cnt <= A; cnt++){
				factorial *= cnt;			
			}
			//output
		System.out.println("The factorial is:" + factorial);	
		}	

	}

}
