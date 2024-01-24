package problemsUsingCollectionAndStreams;

import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ReverseString {

	public static void main(String[] args) {
		//Reverse String
		//****
		String s="siva";
		
		 String s1 = IntStream.range(0, s.length()).mapToObj(i -> s.charAt(s.length() - 1 -i)).map(Object::toString).collect(Collectors.joining());
		
		System.out.println(s1);
		
		 String s2 = Stream.of(s.split("")).collect(Collectors.collectingAndThen(Collectors.toList(), 
				 
				 list ->{
					 Collections.reverse(list);
					 String newString=list.stream().map(String::valueOf).collect(Collectors.joining());
					
					return newString;				 
				 }));
				 
			System.out.println(s2);
		
		

	}

}
