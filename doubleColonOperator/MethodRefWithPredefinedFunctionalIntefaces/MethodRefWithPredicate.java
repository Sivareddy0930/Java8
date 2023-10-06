package doubleColonOperator.MethodRefWithPredefinedFunctionalIntefaces;

import java.util.function.*;

public class MethodRefWithPredicate {
	
		
		 //Predicate we are using which takes one input and return always boolean.
		public static boolean m1(int a) {
			return a>5;
		}

		public static void main(String[] args) {
			
				Predicate<Integer> r = MethodRefWithPredicate :: m1;
				
				System.out.println(r.test(10));
		}
		
}
