import java.util.Scanner;
public class Q2 {

	public static void main(String[] args) {
		//input
		Scanner input=new Scanner(System.in);
		int sum = 0;
		
		do {
			System.out.println("Please input a number:");
			int number = input.nextInt();
			sum += number;
			System.out.printf("The sum is %3d", sum);
			System.out.println("");
		}while (sum <= 300);
		
	}
	
}