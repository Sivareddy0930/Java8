package LambdaInCollection;

	import java.util.ArrayList;
	import java.util.Collections;
	import java.util.Comparator;

	public class WithLambdaInCollection {

		public static void main(String[] args) {
			ArrayList l=new ArrayList();
			l.add(1);
			l.add(8);
			l.add(5);
			l.add(4);
			l.add(0);
			l.add(6);
			l.add(4);
			System.out.println(l);
			
			Comparator<Integer> i=(I1,I2)->((I1<I2)?-1:(I1>I2)?+1:0);
			Collections.sort(l,i);
			System.out.println(l);
			
		}

	}





