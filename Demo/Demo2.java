package Demo;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Demo2 {
	
	
	      public static int[] removeElement(int[] nums, int val) {

		       List list = Arrays.stream(nums).boxed() .collect(Collectors.toList());
		      if(list.contains(val)) {
		    	  Collections.replaceAll(list, val, "_");
	          }
		      System.out.println(list);
		    // nums=list.stream().mapToInt(Integer::intValue).toArray();
		      
		      return nums;
		        }

		        public static void main(String args[]){
		                System.out.println(removeElement(new int[]{3,2,2,3},3));
		        }
		}
	
