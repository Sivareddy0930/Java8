package problemsUsingCollectionAndStreams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicateElementsFromList {

	public static void main(String[] args) {
		
		// Remove Duplicate Elements From  Array
		
		int arr[]= {1,2,3,4,3,4,5,1,2,6};
	
		
			int[] newArray =  Arrays.stream(arr).distinct().toArray();
		System.out.println(Arrays.toString(newArray));
		
		// Remove Duplicate Elements From List
		List<Integer> list=new ArrayList<>();
		list.add(8);
		list.add(1);
		list.add(4);
		list.add(3);
		list.add(8);
		list.add(5);
		list.add(1);
		list.add(4);
		list.add(3);
		list.add(12);
		list.add(2);
		
		
		
		Set<Integer> values = list.stream().collect(Collectors.toSet());
		System.out.println(values);
		
		
	}

}
