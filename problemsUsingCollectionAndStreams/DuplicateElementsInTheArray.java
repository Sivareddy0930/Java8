package problemsUsingCollectionAndStreams;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class DuplicateElementsInTheArray {

	public static void main(String[] args) {
		

		
		//Duplicate Elements In The Array
		
		int arr[]= {1,2,3,4,5,100,4,2,1,200,7,9,8,100,200};
		
		Set s=new HashSet<>();
		for(int i=0;i<arr.length;i++) {
			
			boolean b=!s.add(arr[i]);
			if(b) {
				System.out.println(arr[i]);
			}
		}
		System.out.println(s);
		
		System.out.println("---------------------------------------------------------");
		//java 8 streams.
		
		Set s1=new HashSet<>();
		Arrays.stream(arr).filter(value -> !s1.add(value)).forEach(System.out::println);
		System.out.println(s1);
		
		
	}

}
