package LambdaInCollection.CollectionObjectsInLamada;

import java.util.*;

public class ArrayListWithCollectionOfObjectsSortingWithBasedOnNumbers {
	
	int id;
	String name;
	ArrayListWithCollectionOfObjectsSortingWithBasedOnNumbers(int id,String name){
		this.id=id;
		this.name=name;
	}
		
	//Overriding toString method.
	
	public String toString() {
		return id+":"+name;
	}
	
	public static void main(String[] args) {
		
		ArrayList<ArrayListWithCollectionOfObjectsSortingWithBasedOnNumbers> l=new ArrayList();
		  
		l.add(new ArrayListWithCollectionOfObjectsSortingWithBasedOnNumbers(1234767,"Siva"));
		l.add(new ArrayListWithCollectionOfObjectsSortingWithBasedOnNumbers(4567898,"Reddy"));
		l.add(new ArrayListWithCollectionOfObjectsSortingWithBasedOnNumbers(8749812,"venkata"));
		l.add(new ArrayListWithCollectionOfObjectsSortingWithBasedOnNumbers(4567854,"Tumu"));
		
		System.out.println(l);
		
		//for sorting based on numbers or characters we use compare() method that avaliable in Comparator interface.
		//for sorting based on  Strings we use compareTo() method that avaliable in String class.
		
		
		//sort collection Objects based on id.
		
		//SORTING OBJECT BASED ON ID.
		
		//Syntax:-  Collections.sort(Collection name,Comaparator object);
		
		Collections.sort(l,(e1,e2)->(e1.id < e2.id)? -1 :(e1.id > e2.id)? 1 : 0);
		
		
		System.out.println(l);
		
		
		
	

	}

}
