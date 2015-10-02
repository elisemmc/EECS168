/* -----------------------------------------------------------------------------
 *
 * File Name:  ComputeCircleArea.java
 * Author: Elise McEllhiney
 * Assignment:   EECS-168 Lab 2
 * Description:  This program will compute the area of the circle.
 * Date: Feb 2, 2011
 *
 ---------------------------------------------------------------------------- */
//inport Scaner package
import java.util.Scanner;

public class ComputeCircleArea
{
       public static void main(String[] args)
      {
              //Declare the variables and constants.
	      final double PI = 3.141592; 
              double radius;
              double area;

              //Read the input from the keyboard.
              Scanner keyboard = new Scanner(System.in);  //sets up things to accept keyboard input
              System.out.println("Enter the number for radius:");
              radius = keyboard.nextDouble( );   //reads one real number from the keyboard

              area= radius*radius*PI;
              
              //Display the output
              System.out.println("The area for the circle of radius" + radius + "is" + area);
       }
}
