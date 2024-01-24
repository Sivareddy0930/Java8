package problemsUsingCollectionAndStreams;

import java.util.stream.IntStream;

public class Palindrome {

	public static void main(String[] args) {
		//palindrome or Not
		//****
		String s="aabbaa";
		
		boolean result = IntStream.range(0, s.length()/2).noneMatch( i -> s.charAt(i) != s.charAt(s.length()- 1 -i));
		
		System.out.println(result? "palidorme":"not a palindrome");
		
		

	}

}
