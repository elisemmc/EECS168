/* -----------------------------------------------------------------------------
 *
 * File Name:  dice.java
 * Author: Elise McEllhiney
 * Assignment:   EECS-168 Lab07
 * Description:  This program will calculate the winning percentage for N rolls of crapps.
 * Date: Mar 8, 2012
 *
 ---------------------------------------------------------------------------- */
import java.util.Random;
import java.util.Scanner;

public class dice {

    // return sum of two dice
    public static int sumOfTwoDice() {
    	Random generator = new Random();
    	//generate two random numbers
    	int x = 1+ generator.nextInt(6);
    	int y = 1+ generator.nextInt(6);
        int z = x + y;
        return z;


    }


   /***********************************************************************
    * Pass bet:
    *
    * Player rolls two dice. Let x be sum.
    *   - if x is 7 or 11 instant win
    *   - if x is 2, 3, or 12 instant loss
    *   - otherwise player repeatedly rolls two dice until sum is x or 7
    *        if sum is x then win
    *        if sum is 7 then lose
    ***********************************************************************/
    public static boolean winsPassBet(){
    	int roll = sumOfTwoDice();
    	//instant win
   		if (roll == 7 || roll == 11){
   			return true;
   		}
   		//instant lose
   		else if (roll == 2 || roll == 3 || roll == 12){
   			return false;
   		}
   		//roll until either win or lose
   		else {
   			int roll2;
   			do {
   				roll2 = sumOfTwoDice();
   			}while (roll2 != roll && roll2 != 7);
   			if (roll2 == 7){
   				return false;
   			}
   			else {//roll2 == roll
   				return true;
   			}
   		}
    }



   /***********************************************************************
    *  Run simulation of pass bet N times  
    *  Output winning percentage.          
    ***********************************************************************/
    public static void main(String[] args) {
    	Scanner input= new Scanner(System.in);
    	//number of pass bets
    	System.out.println("Enter number of pass bets to simulate: ");
    	int N = input.nextInt();
    	int win = 0;
    	for (int i = 0 ; i < N ; i++){
    		boolean w = winsPassBet();
    		if (w == true){//count wins
    			win ++;
    		}
    	}
    	double percentage = (double)win / (double)N;//wins over total rolls
    	System.out.println("Winning percentage:" + percentage);
    	
    }

}