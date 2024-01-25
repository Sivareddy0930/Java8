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
import java.util.stream.Stream;

public class CommonElementsBetweenTwoArrays {

	public static void main(String[] args) {
		

		
		// Common Elements Between Two Lists

        List<Integer> list = Arrays.asList(71, 21, 34, 89, 56, 28);
         
        List<Integer> list1 = Arrays.asList(12, 56, 17, 21, 94, 34);
//		System.out.println(list.containsAll(list1));
		
		list1.stream().filter(value -> list.contains(value)).forEach(System.out::println);
		
		
		
	}

}
