package doubleColonOperator;

import java.util.function.Predicate;

public class MethodRef3 {
	
	public static boolean m1(String s) {
		return s.startsWith("J");
	}

	public static void main(String[] args) {
		
			Predicate<String> check = MethodRef3::m1;
			boolean result =check.test("Java");
			System.out.println(result);
			
	}

}
