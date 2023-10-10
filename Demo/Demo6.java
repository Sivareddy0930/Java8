package Demo;

import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo6 {

	
	public static void main(String[] args) {
		int arr1[]= {1,3,5,7};
	
		List<int[]> al=Stream.of(arr1).unordered().collect(Collectors.toList());
		System.out.println(al);
	
	}

}
