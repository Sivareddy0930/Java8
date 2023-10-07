package doubleColonOperator.MethodRefWithPredefinedFunctionalIntefaces;

import java.util.Date;
import java.util.function.*;

public class MethodRefWithSupplier {
	
		
		 //Supplier we are using which doesn't takes any input and return Something.
		public static Date m1() {
			return new Date();
		}

		public static void main(String[] args) {
			
				Supplier<Date> r = MethodRefWithSupplier :: m1;
				
				System.out.println(r.get());
		}
		
}
