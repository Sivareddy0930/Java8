package problemsUsingCollectionAndStreams;

import java.util.stream.IntStream;

public class PrintFirst10EvenNumbers {

	public static void main(String[] args) {
		
		IntStream.range(1, 11).map( i -> i*2).forEach(System.out::println);

	}

}
