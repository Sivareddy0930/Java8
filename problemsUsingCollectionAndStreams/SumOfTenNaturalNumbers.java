package problemsUsingCollectionAndStreams;

import java.util.stream.IntStream;

public class SumOfTenNaturalNumbers {

	public static void main(String[] args) {
		//Sum Of Ten Natural Numbers
		
		int sum=IntStream.range(0, 11).sum();
		System.out.println(sum);
	}

}
