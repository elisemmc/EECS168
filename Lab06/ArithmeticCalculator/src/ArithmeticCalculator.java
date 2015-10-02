/* -----------------------------------------------------------------------------
 *
 * File Name:  ArithmeticCalculator.java
 * Author: Elise McEllhiney
 * Assignment:   EECS-168 Lab06
 * Description:  This program will perform requested arithmetic calculation on two numbers.
 * Date: Mar 1, 2012
 *
 ---------------------------------------------------------------------------- */
import java.util.Scanner;
public class ArithmeticCalculator {

	public static void main(String[] args){
		//continue
		int c = 1;
		do{
			Scanner input = new Scanner(System.in);
			//choose calculation
			System.out.print("Choose an operator: \n 1. ADD \n 2. SUBTRACT \n 3. MULTIPLICATION \n 4. DIVISION \n");
			int choice= input.nextInt();
			//calculate
			System.out.println("Please enter the two numbers you wish to calculate");
			double x = input.nextDouble();
			double y = input.nextDouble();
			if (choice == 1){
				System.out.println("The result is:" + Add(x,y));
			}
			else if (choice == 2){
				System.out.println("The result is:" + Subtract(x,y));
			}
			else if (choice == 3){
				System.out.println("The result is:" + Multiply(x,y));
			}
			else {
				System.out.println("The result is:" + Divide(x,y));
			}
			System.out.println("");
			System.out.println("Do you want another try? (1 for Yes, 0 for No)");
			c = input.nextInt();
			if (c == 0){
				System.out.println("Goodbye!");
			}
		} while (c == 1);
	}
	
	//addition
	public static double Add(double x, double y){
		double X = x + y;
		return X;
	}
	
	//subtraction
	public static double Subtract(double x, double y){
		double X = x - y;
		return X;
	}
	
	//multiplication
	public static double Multiply(double x, double y){
		double X = x * y;
		return X;
	}
	
	//division
	public static double Divide(double x, double y){
		double X = x / y;
		return X;
	}
}