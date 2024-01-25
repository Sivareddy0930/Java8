package problemsUsingCollectionAndStreams;

public class FibonacciSeries {
	static void m1(int value) {
		int a=0;
		int b=1;
		int c;
		System.out.println(a);
		System.out.println(b);
		while(value >= 0) {
			c = a+b;
			System.out.println(c);
			a=b;
			b=c;
			value--;
		}
	}
	
	public static void main(String[] args) {
		//Fibonacci Series
		
		m1(8);
	}
}
