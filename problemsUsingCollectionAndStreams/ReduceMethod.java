package problemsUsingCollectionAndStreams;

import java.util.*;

public class ReduceMethod {
  
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

	Optional<Integer> sum=numbers.stream().reduce((a,b)-> a+b);
	System.out.println(sum.get());

	}
}
