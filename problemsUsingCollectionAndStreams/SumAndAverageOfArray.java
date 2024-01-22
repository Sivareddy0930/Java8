package problemsUsingCollectionAndStreams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SumAndAverageOfArray {

	public static void main(String[] args) {
		
		// Sum And Average of Array Elemnts.
		
		int arr[]= {3,4,5,1,2,6};
	
		
		IntSummaryStatistics result=Arrays.stream(arr).boxed().collect(Collectors.summarizingInt(Integer::intValue));
		System.out.println("sum:-"+ result.getSum());
		System.out.println("Average:-"+ result.getAverage());
		
		//   (OR)
		
		int	sum=Arrays.stream(arr).sum();
		System.out.println(sum);
		
		double	average=Arrays.stream(arr).average().getAsDouble();
		System.out.println(average);
		
		

	}

}
