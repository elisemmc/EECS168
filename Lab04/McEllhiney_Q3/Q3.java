public class McEllhineyh_Q3 {

	public static void main(String[] args) {
		//initial variables
		double num = 1;
		int cnt = 1;
		double sum = 0;
		while(cnt <= 10){
			int initial = cnt * 5000;
			if(num <= initial){
				double N = (1/(2*num-1));
				//+- pattern
				if (num%2 != 0){
					sum += N;
				}
				else {
					sum -= N;
				}
				num++;
				//output at desired value of num
				if(num==initial){
					System.out.printf("%2.6f, ", (4*sum));
					cnt++;
				}
			}

		}
	}
}