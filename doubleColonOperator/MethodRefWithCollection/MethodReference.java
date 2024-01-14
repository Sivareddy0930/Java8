package doubleColonOperator.MethodRefWithCollection;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MethodReference {

	public static void main(String[] args) {
		
		List<String> al =Arrays.asList("Siva","Vamsi","vasu","Naveen");
		
		//Static methods reference
		
		System.out.println("using lambda expression:-");
		al.stream().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		
		System.out.println("using method references:-");
		al.stream().map(String::toLowerCase).forEach(System.out::println);
				

	}

}
