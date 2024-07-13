package PredefinedFunctionalInterfaces.predicate;
import java.util.function.*;
import java.util.*;
public class PredicateExample2 {

	public static void main(String[] args) {
       int arr[]= {1,2,3,4,55,1,3,28,9,8,};
       
       
       
       Set<Integer> nonDuplicateElements = new HashSet<>();
       
       
       List<Integer> duplicateElements =new ArrayList<>();
       
      
       
      Predicate<Integer> check =  value -> nonDuplicateElements.add(value);
      
      for(Integer value:arr) {
   	   if(!nonDuplicateElements.add(value)) {
   		duplicateElements.add(value);
   	   }
      }
      
      System.out.println(duplicateElements);
      
     
	}

}
