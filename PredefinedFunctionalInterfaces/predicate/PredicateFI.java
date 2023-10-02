package PredefinedFunctionalInterfaces.predicate;

import java.util.function.Predicate;

//where ever conditional check is required we us Predicate.

public class PredicateFI {

	public static void main(String[] args) {
		// check weather string length is >5 or not.
		
		Predicate<String> t=s->s.length()>5;
		
		System.out.println(t.test("Tumu venkata Siva reddy "));
		
			
	}

}
