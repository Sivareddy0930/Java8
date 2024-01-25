package problemsUsingCollectionAndStreams;

import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Palindrome2 {

	public static void main(String[] args) {
		//palindrome or Not
		//****
		String s="ab ba";
//		String s="ROTATOR";
		
		String result = Stream.of(s).map( value -> new StringBuffer(value).reverse().toString()).collect(Collectors.joining());
		System.out.println(result);
		System.out.println(result .equals(s)? "palidorme":"not a palindrome");		

	}

}
