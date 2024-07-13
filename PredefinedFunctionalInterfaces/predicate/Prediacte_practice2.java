package PredefinedFunctionalInterfaces.predicate;
import java.util.function.*;
public class Prediacte_practice2 {

	public static void main(String[] args) {
		
		Predicate<Character> result1 =(arg)->{ return Character.isDigit(arg);};
		
		Predicate<Character> result2 =(arg)-> Character.getNumericValue(arg)%2 == 0;
		
		System.out.println(result1.test('4'));
		
		System.out.println(result1.and(result2).test('8'));
		
		System.out.println(result1.or(result2).test('5'));
		
		System.out.println(result1.and(result2).negate().test('7'));

		 
		 
		
	}

}
