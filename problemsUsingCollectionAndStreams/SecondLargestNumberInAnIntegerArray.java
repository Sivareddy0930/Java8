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

public class SecondLargestNumberInAnIntegerArray {

	public static void main(String[] args) {
		
		// Second Largest Number In An Integer Array
		
		int arr[]= {3,4,5,1,2,6,100,99};
	
		
			OptionalInt lastElement =  Arrays.stream(arr).sorted().skip(arr.length - 2).findFirst();
		System.out.println(lastElement.getAsInt());
		
		//Second Largest Number In An Integer List
		List<Integer> list=new ArrayList<>();
		list.add(1);
		list.add(4);
		list.add(3);
		list.add(12);
		list.add(2);
		list.add(8);
		list.add(20);
		Optional<Integer> lastValue = list.stream().sorted().skip(list.size()-2).findFirst();
		System.out.println(lastValue.get());
		
		
	}

}
