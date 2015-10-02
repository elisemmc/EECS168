/* -----------------------------------------------------------------------------
 *
 * File Name:  FindGCD.java
 * Author: Elise McEllhiney
 * Assignment:   EECS-168 Lab06
 * Description:  This program will give the GCD.
 * Date: Mar 1, 2012
 *
 ---------------------------------------------------------------------------- */
import java.util.Scanner;
public class FindGCD {

	public static void main(String[] args){
		int c = 1;
		do{
			Scanner input = new Scanner(System.in);
			System.out.println("Please enter two numbers:");
			int x = input.nextInt();
			int y = input.nextInt();
			System.out.println("The GCD is:" + GCD(x,y));
			System.out.println("Would you like to continue? (1 for Yes, 0 for No)");
			c = input.nextInt();
		} while (c == 1);
	}
	
	//find GCD
	public static int GCD(int x, int y){
		int n1 = (x > y)? x:y;
		int n2 = (x < y)? x:y;
		while (n2 != 0){
			while (n1 >= n2){
				n1 -= n2;
			}
			x=n1;
			n1=n2;
			n2=x;
		}
		return n1;
		
	}
}