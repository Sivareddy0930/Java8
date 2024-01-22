package problemsUsingCollectionAndStreams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyOfCharacter {

	public static void main(String[] args) {
		
	//Frequency of Characters.
		
		String s="I am from AndhraPradesh";

//		for char[] we can't  make stream directly due to absence of CharStream .but int types IntStream is there.
		//chars() generate IntStream of characters in String and that is converted char type using mapToObj().
		//it also count spaces..
		Map<Character, Long> Frequency=s.chars().mapToObj(n -> (char)n).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(Frequency);
		
		//remove spaces.
		Map<Character, Long> Frequency1=s.replaceAll(" ", "").chars().mapToObj(n -> (char)n).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(Frequency1);
		
		//fequency of numbers.
		int arr[]= {1,2,3,4,5,4,8,2,1,9,4,4,2,4,4};
		//Arrays.stream(arr) it retuens IntStream
		Map<Integer,Long > freq=Arrays.stream(arr).boxed().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(freq);

	}

}
