package Demo;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

class Emp{
	
}
class Cust{
	
}
class Demo1 {
public static void main(String args[]){
//    int arr[]= {1,2,3,41,2,2};
	
	 String arr[]= {"a","b","c","d","a","z","a","d","a"};
   
    int lengthOfNewArray=0;
    int ele=0;

    for(int i=0;i<arr.length;i++) {
    	int count=0;
    	for(int j=0+i;j<arr.length;j++) {
    		if(arr[i]==arr[j]) {
    			count++;
    		}
    	}
    	if(count==1) {
    		lengthOfNewArray++;
    	}
    	
    }
    String arr1[]=new String[lengthOfNewArray];
    
    for(int i=0;i<arr.length;i++) {
    	int count=0;
    	for(int j=0+i;j<arr.length;j++) {
    		if(arr[i]==arr[j]) {
    			count++;
    		}
    	}
        	
    	
    	if(count==1) {
    		arr1[ele]=arr[i];
    		ele++;
    	}
    	
    }
    
    System.out.println(Arrays.toString(arr1));

   
}
    
    
}
