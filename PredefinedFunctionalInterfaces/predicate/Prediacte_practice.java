package PredefinedFunctionalInterfaces.predicate;
import java.util.function.*;
public class Prediacte_practice {

	public static void main(String[] args) {
		
		Predicate<Integer> p1 = n->n%2==0;
//		Predicate<Integer> p = n->n%2==0 && n>10;
		 
		 
		 Predicate<Integer> p2 = n->n>10;
		 
		 System.out.println(p1.and(p2).test(40));//true
		 System.out.println(p1.or(p2).test(4));//true  Here altlest one condition is true.
		 System.out.println(p1.and(p2).negate().test(40));//false

		 
		 
		
	}

}
