package problemsUsingCollectionAndStreams;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SumOfAllDigitsOfANumber {

	public static void main(String[] args) {
		int num=1234;
		
		//Sum Of All Digits Of A Number.
		
		int sum=Stream.of((num+"").split("")).mapToInt(Integer::valueOf).sum();
		//int sum=Stream.of((num+"").split("")).mapToInt(Integer::parseInt).sum();
		System.out.println(sum);
		
		

	}

}
