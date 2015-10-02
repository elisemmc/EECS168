/* -----------------------------------------------------------------------------
 *
 * File Name:  CircleArea.java
 * Author: Elise McEllhiney
 * Assignment:   EECS-168 Lab 2
 * Description:  This program will compute the area of the circle.
 * Date: Feb 2, 2011
 *
 ---------------------------------------------------------------------------- */

public class CircleArea
{
       public static void main(String[] args)
      {
              final double PI = 3.141592; 
              double radius;
              double area;

              //Assign a radius
              radius = 20;
              area = radius*radius*PI;
              System.out.println("The area for the circle of radius " + radius + " is " + area);

       }
}
