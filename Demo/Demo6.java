package Demo;

import java.util.TreeSet;

public class Demo6 {

	public static TreeSet shortArray(int arr1[],int arr2[]) {
		
		int n1=arr1.length+arr2.length;
		
		TreeSet ts=new TreeSet();
		
		for(int i=0;i<arr1.length;i++) {
			ts.add(arr1[i]);
		}
		for(int i=0;i<arr2.length;i++) {
			ts.add(arr2[i]);
		}
					
		return ts;
		
		
		
		
		
	}
	public static void main(String[] args) {
		int arr1[]= {1,3,5,7};
		int arr2[]= {2,6,8};
		System.out.println(shortArray(arr1,arr2));
	}

}
