package problemsUsingCollectionAndStreams;

import java.util.Arrays;
import java.util.List;

public class FindStringsThatStartWithNumber {

	public static void main(String[] args) {
		// Find Strings That Start With Number
		
		List<String> list=Arrays.asList("1one","2two","new","class");
		
		list.stream().filter( s -> Character.isDigit(s.charAt(0))).forEach(System.out::println);

	}

}
