/* -----------------------------------------------------------------------------
 *
 * File Name:  Factorial.java
 * Author: Elise McEllhiney
 * Assignment:   EECS-168 Lab05
 * Description:  This program will make a pyramid
 * Date: Feb 23, 2012
 *
 ---------------------------------------------------------------------------- */
public class Pyramid {
	public static void main(String[] args){;
		//initial width of pyramid
		int A = 5;
		//top half of pyramid in decreasing number of stars
		for (int h = 1; h <= 5; h++){
			System.out.println("");
			for (int w =1; w <= A; w++){
				System.out.print("*");
			}
			A--;
		}	
		//bottom half of the pyramid in increasing number of stars
		for (int h = 1; h <= 5; h++){
			System.out.println("");
			for (int w = 1; w <= h; w++){
				System.out.print("*");
			}
		}	
	}

}
