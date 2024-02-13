package Demo.pTasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.OptionalInt;
import java.util.Scanner;
import java.util.stream.Stream;

public class Demo7 {
    public static void main(String[] args) {
       int[] arr= {1,2,3,4,5,66};
        
        OptionalInt findFirst = Arrays.stream(arr).sorted().skip(1).findFirst();
        System.out.println(findFirst.getAsInt());

}
}