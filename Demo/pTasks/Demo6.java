package Demo.pTasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class Demo6 {
    public static void main(String[] args) {
        String[] arr1= {"xyz","def","ghi","jkl"};
        String[] arr2= {"aabc","def","ghai","jkl","kll"};
        String[] common;
        
        List<String> l1=new ArrayList<>(Arrays.asList(arr1));
        List<String> l2=new ArrayList<>(Arrays.asList(arr2));
        l1.retainAll(l2);
        System.out.println(l1);
        common= (String[]) l1.toArray(new String[0]);
        System.out.println(Arrays.toString(common));

}
}