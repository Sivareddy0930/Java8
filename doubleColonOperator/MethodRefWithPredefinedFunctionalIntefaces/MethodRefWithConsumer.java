package doubleColonOperator.MethodRefWithPredefinedFunctionalIntefaces;

import java.util.function.*;

public class MethodRefWithConsumer {
	
		
		 //Consumer we are using which takes one input and return Nothing.
		public static void m1(int a) {
			System.out.println("result:-"+a);
		}

		public static void main(String[] args) {
			
				Consumer<Integer> r = MethodRefWithConsumer :: m1;
				
				r.accept(10);
		}
		
}
