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

public class LastElementOfAnArray {

	public static void main(String[] args) {
		
		// Last Element Of An Array
		
		int arr[]= {3,4,5,1,2,6};
	
		
			OptionalInt lastElement =  Arrays.stream(arr).skip(arr.length-1).findFirst();
		System.out.println(lastElement.getAsInt());
		
		// Last Element Of An List
		List<Integer> list=new ArrayList<>();
		list.add(1);
		list.add(4);
		list.add(3);
		list.add(12);
		list.add(2);
		list.add(8);
		list.add(5);
		Optional<Integer> lastValue = list.stream().skip(list.size()-1).findFirst();
		System.out.println(lastValue.get());
		
		
	}

}
