package Demo;
import java.util.*;

public class StringPer {

			public static boolean StringPer(String s1,String s2) {
				
				
				int[] arr=new int[500];
				
				
				for(int i=0;i<s1.length();i++) {
					arr[(int)s1.charAt(i)]+=1;
			
				}
				for(int i=0;i<s2.length();i++) {
					arr[(int)s2.charAt(i)]-=1;
				}
				
				
				for(int i=0;i<arr.length;i++) {
					if(arr[i]!=0) {
						return false;
					}
				}
				return true;
				
				
			}
	
	public static void main(String[] args) {
		
		String s1="abcde";
		String s2="cdbea";
		
		String s3="abcde";
		String s4="cdbaea";
		
		System.out.println(StringPer(s1,s2));
		System.out.println(StringPer(s3,s4));

	}

}
