package Demo.Test.Task;

import java.util.Arrays;

public class Task3 {
	public static void main(String[] args) {
		int a[]= {1,2,3,4,5};
		int sum = Arrays.stream(a).sum();
		System.out.println(sum);
	}
}
