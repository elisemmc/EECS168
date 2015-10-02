/* -----------------------------------------------------------------------------
 *
 * File Name:  ConvertTemperature.java
 * Author: Elise McEllhiney 
 * Assignment:   EECS-168 Lab 2
 * Description:  This program will convert the input temperature from Fahrenheit to Celsius.
 * Date: Feb 2, 2011
 *
 ---------------------------------------------------------------------------- */
import java.util.Scanner;

public class ConvertTemperature
{
       public static void main(String[] args)
      {
              //Declare the variables and constants.
              double temp;
              double area;
	      double Celcius;

              //Read the input from the keyboard.
              Scanner input = new Scanner(System.in);  //sets up things to accept keyboard input
              System.out.println("Enter temperature in Fahrenheit:");
              temp = input.nextDouble( );   //reads one real number from the keyboard

              Celcius = (temp-32)/9.0*5.0;
              
              //Display the output
              System.out.println( temp + " degrees Farenheit is " + Celcius + " degrees Celcius.");
       }
}
