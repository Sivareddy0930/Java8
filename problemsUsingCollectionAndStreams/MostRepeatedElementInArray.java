package problemsUsingCollectionAndStreams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MostRepeatedElementInArray {

	public static void main(String[] args) {
		
String[] s = {"Pen", "Eraser", "Note Book", "Pen", "Pencil", "Pen", "Note Book", "Pencil"};


	  List<String> listOfStrings = Arrays.asList(s);
	  
	Map<String, Long> mapCount=  listOfStrings.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
	
	Entry<String, Long> mostFrequentElement =	mapCount.entrySet().stream().max(Map.Entry.comparingByValue()).get();
	  System.out.println(mostFrequentElement);
		
		
		
	}

}
