/*
 * 	File Name: McEllhiney_Q1
	Author: Elise McEllhiney 
    KUID: 2298962
	Email Address: elisemmc@yahoo.com 
	Test Problem Number: 1
	Description: Finds the minimum of 3 numbers.
	Last Changed: Mar. 8, 2012

 */
import java.util.Scanner;
public class McEllhiney_Q1 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Are you inputting integer or double (0 for int 1 for double)");
		int c = input.nextInt();//determine if program should input values as integer or double numbers
		while (c != 0 && c != 1){
			System.out.println("Please input 1 or 0");
			c = input.nextInt();
		}
		System.out.print("Please enter three numbers:");
		//if person wants to input integers
		if (c == 0){
			int x = input.nextInt();
			int y = input.nextInt();
			int z = input.nextInt();
			System.out.println("The min is " + min(x,y,z));
		}
		//if person wants to input doubles
		if (c == 1){
			double x = input.nextDouble();
			double y = input.nextDouble();
			double z = input.nextDouble();
			System.out.println("The min is " + min(x,y,z));
		}
		//if person enters something other than 0 or 1

	}
	
	//find minimum of 3 integer values
	public static int min(int x, int y, int z){
		int min;
		if (x < y && x < z){
			min = x;
		}
		else if (y < z){
			min = y;
		}
		else {
			min = z;
		}
		return min;
	}
	
	//find minimum of 3 double values
	public static double min(double x, double y, double z){
		double min;
		if (x < y && x < z){
			min = x;
		}
		else if (y < z){
			min = y;
		}
		else {
			min = z;
		}
		return min;
	}
}