/* -----------------------------------------------------------------------------
 *
 * File Name:  bonus.java
 * Author: Elise McEllhiney
 * Assignment:   EECS-168 Lab07
 * Description:  This program will calculate bonus amounts.
 * Date: Mar 8, 2012
 *
 ---------------------------------------------------------------------------- */
import java.util.Scanner;
public class bonus {

	final static int UNITS_PT = 250;
	final static int UNITS_FT = 700;

	public static void main(String[] args) 
	{

		Scanner keysIn = new Scanner(System.in);
	        int dept =0;
		System.out.println("Enter department: ");
		dept = keysIn.nextInt();
		double bonus = 0;
		switch (dept)
		{
		case 1:
			System.out.print("Enter sales: ");
			double sales = keysIn.nextDouble();
			bonus = getBonus(sales);//the method getBonus is called in all the 3 cases here.
			break;
		case 2:
			System.out.print("Enter number of units sold: ");
			int numUnits = keysIn.nextInt();
			bonus = getBonus(numUnits);
			break;
		case 3:
			System.out.print("Enter # of pieces completed: ");
			int pieces = keysIn.nextInt();
			System.out.print("\nFull-time (1) or Part-Time (2)?");
			int empType = keysIn.nextInt();
			bonus = getBonus(pieces, empType);		
	                break;
		default:
			System.out.print("Error!  ");
		}
		System.out.println("Bonus Amount: " + bonus);
	}
	//department 1 bonus
	public static double getBonus(double x){
		double bonus;
		if(x > 5000){
			bonus = x * .05;
		}
		else{
			bonus = 0;
		}
		return bonus;
	}
	//department 2 bonus
	public static double getBonus(int x){
		double bonus;
		if(x <= 25){
			bonus = x * 100;
		}
		else{
			bonus = x * 150;
		}
		return bonus;
	}
	//department 3 bonus
	public static double getBonus(double x, int type){
		double bonus;
		if (type == 1){//full time
			if (x <= 700){
				bonus = 0;
			}
			else {
				bonus = .10 * x;
			}
		}
		else{//part time
			if (x <= 250){
				bonus = 0;
			}
			else {
				bonus = .10 * x;
			}
		}
		return bonus;
	}
}