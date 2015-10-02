/* -----------------------------------------------------------------------------
 *
 * File Name:  EvenSum.java
 * Author: Elise McEllhiney
 * Assignment:   EECS-168 Lab05
 * Description:  This program will compute the sum of the even integers up to the entered number.
 * Date: Feb 23, 2012
 *
 ---------------------------------------------------------------------------- */
import java.util.Scanner;
public class EvenSum {
	public static void main(String[] args){
		//input
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the value for n");
		int A = input.nextInt();
		//variables
		int sum=0;
		int cnt = 1;
		do {
			if (cnt%2 == 0){//add if it is even number
				sum += cnt;
				cnt ++;
			}
			else {//skip it if it is odd
				cnt ++;
			}
		}while (cnt <= A);
		//output
		System.out.println("The sum of the even integers from 2 to " + A + " is " + sum);
	}

}
