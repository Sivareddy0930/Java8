package problemsUsingCollectionAndStreams;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class DuplicateCharacterInString {

	public static void main(String[] args) {
		

		
		//Duplicate Character In String.
		
		 String inputString = "Java Concept Of The Day";
		
		Set s=new HashSet<>();
		for(int i=0;i< inputString.length();i++) {
			
			boolean b=!s.add(inputString.charAt(i));
			if(b) {
				System.out.println(arr[i]);
			}
		}
		System.out.println(s);
		
		System.out.println("---------------------------------------------------------");
		//java 8 streams.
		
		Set s1=new HashSet<>();
		Arrays.stream(arr).filter(value -> !s1.add(value)).forEach(System.out::println);
		System.out.println(s1);
		
		
	}

}
