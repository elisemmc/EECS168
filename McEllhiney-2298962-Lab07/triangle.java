/* -----------------------------------------------------------------------------
 *
 * File Name:  triangle.java
 * Author: Elise McEllhiney
 * Assignment:   EECS-168 Lab07
 * Description:  This program will give the assigned pattern.
 * Date: Mar 8, 2012
 *
 ---------------------------------------------------------------------------- */
import java.util.Scanner;
public class triangle {

	public static void main(String[] args){
		Scanner input= new Scanner(System.in);
		System.out.println("Enter n");
		int x = 1;
		int y = input.nextInt();
		trianglegenerate(x,y);
	}
	
	//find triangle
	public static void trianglegenerate(int x, int y){
		for(int i = 1;  i <= y; i ++){//top half of triangle
			for(int q = 1;  q <= i; q ++){
				System.out.print(q + " ");
			}
		System.out.println("");
		}
		for(int i = y - 1;  i >= x; i --){//bottom half of triangle
			for(int q = 1;  q <= i; q ++){
				System.out.print(q + " ");
			}
		System.out.println("");
		}
	}
}

