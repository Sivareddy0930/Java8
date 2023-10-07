package doubleColonOperator.MethodRefWithCollection;

import java.util.ArrayList;


public class MethodRefWithList2 {
	private static void returnName(String s) {
		
		System.out.println(s);
	}

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("Siva");
		al.add("Munny");
		al.add("Bunny");
		al.add("Cunny");
		al.add("Kunny");
		
		
		al.forEach(MethodRefWithList2::returnName);
		
		
		}

}
