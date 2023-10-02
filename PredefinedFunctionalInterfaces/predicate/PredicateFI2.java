package PredefinedFunctionalInterfaces.predicate;

import java.util.function.Predicate;
import java.util.*;



public class PredicateFI2 {

	public static void main(String[] args) {
		// print String length with even size.
		
		ArrayList<String> al=new ArrayList<String>();
		al.add("Siva");
		al.add("Reddy");
		al.add("Tumu");
		al.add("Venkata");
		al.add("yellaReddy");
		al.add("Kingu");
		
		
		Predicate<String> t=s->s.length()%2==0;
		
		for(String s1:al) {
			if(t.test(s1)) {
				System.out.println(s1);
			}
		}
		

		
			
	}

}
