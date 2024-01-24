package problemsUsingCollectionAndStreams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FrequenecyOfEachElementInList {

	public static void main(String[] args) {
		

		// Frequenecy Of Each Element In List
		List<Integer> list=new ArrayList<>();
		list.add(1);
		list.add(4);
		list.add(3);
		list.add(4);
		list.add(12);
		list.add(2);
		list.add(4);
		list.add(8);
		list.add(4);
		list.add(5);
		list.add(4);
		list.add(3);
		list.add(4);
		list.add(12);
		list.add(2);
		Map<Integer, Long> frequenecyValue = list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(frequenecyValue);
		
		
	}

}
