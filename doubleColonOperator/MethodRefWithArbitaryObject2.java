package doubleColonOperator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;



 class MethodRefWithArbitaryObject2 {
	 
	

	public static void main(String[] args) {
		
		List<String> al = Arrays.asList("zupppy","kuuuuuuppy","nupppppy","aupppppppppppy","oupy");
		
		al.stream().sorted().forEach(System.out::println);
		
		System.out.println("======================================================================");
		
		al.stream().sorted(Comparator.comparing(String::length)).forEach(System.out::println);
		
	}

}
