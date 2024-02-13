package Demo.pTasks;

import java.util.Arrays;
import java.util.Iterator;

public class Demo3 {

	public static void main(String[] args) {
		String s="abcd";
		int[] array=s.chars().toArray();
		System.out.println(Arrays.toString(array));
		
		char[] arr=s.toCharArray();
		for(char c:arr) {
			System.out.println((int)c);
		}

	}

}
