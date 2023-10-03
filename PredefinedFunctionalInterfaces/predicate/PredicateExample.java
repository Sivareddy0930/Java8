package PredefinedFunctionalInterfaces.predicate;
import java.util.function.*;
import java.util.*;
public class PredicateExample {

	public static void main(String[] args) {
       int arr[]= {1,2,3,4,55,1,3,28,9,8,};
       
       Set<Integer> encountered = new HashSet<>();
       
       Predicate<Integer> isDuplicate = n -> !encountered.add(n);
       
       List al=new ArrayList();
       
       for(Integer a:arr) {
    	   
    	   if(isDuplicate.test(a)){
    		      al.add(a);		   
    	   }
    	   
       }
       System.out.println(al);
       
	}

}
