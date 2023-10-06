package doubleColonOperator.MethodRefWithPredefinedFunctionalIntefaces;

import java.util.function.Function;

public class MethodRefWithFunction {
	
		
		 //Function we are using which takes one input and return any typeof output.
		public static int m1(int a) {
			return a;
		}

		public static void main(String[] args) {
			
				Function<Integer,Integer> r = MethodRefWithFunction :: m1;
				
				System.out.println(r.apply(10));
		}
		
}
