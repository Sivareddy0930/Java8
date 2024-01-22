package problemsUsingCollectionAndStreams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MergeTwoUnsortedArraysInToSorted {

	public static void main(String[] args) {
		
		//Merge Two Unsorted Arrays In To Single Sorted Array.
		int arr1[]= {3,4,5,1,2,6};
		int arr2[]= {7,9,8,10,4};
		
		int[] sortedArray=IntStream.concat(Arrays.stream(arr1),Arrays.stream(arr2)).sorted().toArray();
		System.out.println(Arrays.toString(sortedArray));
		
		

	}

}
