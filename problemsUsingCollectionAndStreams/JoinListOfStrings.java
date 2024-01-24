package problemsUsingCollectionAndStreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JoinListOfStrings {

	public static void main(String[] args) {
		
		List<String> listOfStrings = Arrays.asList("Java", "Python", "C#", "Java", "Kotlin", "Python");
		
		// Join List Of Strings with prefix,suffix,deleimeter.
		
		String result=listOfStrings.stream().collect(Collectors.joining());
		System.out.println(result);
		
		String result1=listOfStrings.stream().collect(Collectors.joining(",","(",")"));
		System.out.println(result1);
		

	}

}
