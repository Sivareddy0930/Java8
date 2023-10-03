package PredefinedFunctionalInterfaces.predicate;

import java.util.function.Predicate;
import java.util.*;



public class PredicateJoining2 {

	public static void main(String[] args) {
		
		String s="Siva";
		
	
		
				Predicate<String> p1=Predicate.isEqual(s);
		
				//isEqual() 
				
			System.out.println(p1.test("Siva"));//true
			System.out.println(p1.test("siva"));//false
			
			

		
			
	}

}
