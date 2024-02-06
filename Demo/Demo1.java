package Demo;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


class Demo1 {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] arr=IntStream.concat(Arrays.stream(nums1),Arrays.stream(nums2)).sorted().toArray();
        if(arr.length%2==0){
        	
           int value= arr.length/2;
           System.out.println(value);
           return (arr[value-1]+arr[value]) / 2.0 ;
        }
        else{
        	System.out.println("odd");
            int value2= (int)Math.ceil(arr.length/2);
            return arr[value2];
            
        }
    }

    public static void main(String args[]){

    	 int[] nums= {2,5,6,0,0,1,2};
         List<Integer> al= Arrays.stream(nums).boxed().collect(Collectors.toList());
         Collections.rotate(al,5);
         
         int[] arr = al.stream().mapToInt(Integer::intValue).toArray();
         System.out.println(al);
         
        
    } 
    
}
