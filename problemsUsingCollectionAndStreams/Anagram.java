package problemsUsingCollectionAndStreams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Anagram {

	public static void main(String[] args) {
		
	//Anagrams are not.
		
	String s1="siva ";
	String s2=" vasi";
	char[] arr1=s1.replaceAll(" ","").toLowerCase().toCharArray();
	char[] arr2=s2.replaceAll(" ","").toLowerCase().toCharArray();
	
	Arrays.sort(arr1);
	Arrays.sort(arr2);
	
	
	boolean result = Arrays.equals(arr1, arr2);
	
	System.out.println(result?"Anagram":"Not an Anagram");
	
	// using java 8 Streams
	
		String newString1 = Stream.of(s1.replaceAll(" ", "").toLowerCase().split("")).sorted().collect(Collectors.joining());
		
		String newString2 = Stream.of(s2.replaceAll(" ", "").toLowerCase().split("")).sorted().collect(Collectors.joining());
		
		System.out.println(newString1.equals(newString2)?"Anagram":"Not an Anagram");

	}

}
