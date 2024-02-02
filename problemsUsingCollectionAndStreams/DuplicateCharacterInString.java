package problemsUsingCollectionAndStreams;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DuplicateCharacterInString {

	public static void main(String[] args) {
		

		
		//Duplicate Character In String.
		
		 String inputString = "Java Concept Of The Day";
		
		//java 8 streams.
		 
		
			Map<String, Long> resultMap=Stream.of(inputString.trim().replaceAll(" ", "").toLowerCase().split("")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
			System.out.println(resultMap);
	
	
				
				
			resultMap.entrySet().stream().filter(entery -> entery.getValue()>1).forEach(entry ->System.out.println(entry.getKey()));
			List al=resultMap.entrySet().stream().filter(entery -> entery.getValue()>1).map(entry -> entry.getKey() ).collect(Collectors.toList());
			System.out.println(al);
		
		

		
	}

}
