package problemsUsingCollectionAndStreams;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReverseEachWordOfAString {

	public static void main(String[] args) {
		
	//Reverse Each Word Of A String.
		
		String s="I am from AndhraPradesh";
		
		String revString=Stream.of(s.trim().split(" ")).collect(Collectors
				.collectingAndThen(Collectors.toList(), 
						list -> {
						Collections.reverse(list);
						String newString=String.join(" ", list);
						return newString;	
						}));
		
		System.out.println(revString);//AndhraPradesh from am I
		
		//----------------------------------------
		
		String s1=Stream.of(s.trim().split(" ")).map(value -> new StringBuffer(value).reverse().toString()).collect(Collectors.joining(" "));
		System.out.println(s1);//I ma morf hsedarParhdnA
	}

}
