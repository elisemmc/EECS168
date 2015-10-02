import java.util.Scanner;
public class testing{

	public static void main(String[] args) {
		//input
		Scanner input=new Scanner(System.in);
		System.out.println("Please input x value:");
		//variables
		double x = input.nextDouble();
		double y;
				y = (5/9)*(2*(x)-1);
			System.out.println("If x = " + x + ", then y = " + y);
		}
}
