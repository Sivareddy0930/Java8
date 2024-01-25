package problemsUsingCollectionAndStreams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ReverseIntegerArray2 {

	public static void main(String[] args) {
		
		// Reverse Integer Array.
		
		int arr[]= {3,4,5,1,2,6};
	
		int[] newArray = IntStream.range(0, arr.length).map(i -> arr[arr.length - 1 - i]).toArray();
		System.out.println(Arrays.toString(newArray));
		
		
	}

}
