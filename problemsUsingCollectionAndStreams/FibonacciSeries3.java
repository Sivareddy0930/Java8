package problemsUsingCollectionAndStreams;

public class FibonacciSeries3 {
	//recurssion.
	static int a=0;
	static int b=1;
	static int c=0;
	static void m1(int value) {
			if(value >0) {
				c = a+b;
				System.out.println(c);
				a=b;
				b=c;
				m1(value-1);
			}
	}
	
	public static void main(String[] args) {
		//Fibonacci Series
		
	}
}
