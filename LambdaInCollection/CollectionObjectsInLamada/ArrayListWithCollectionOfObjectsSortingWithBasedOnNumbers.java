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
		
		//for sorting based on numbers or characters in custom format we use compare() method that available in Comparator interface.
		//for sorting based on  Strings we use compareTo() method that available in String class.which is overridden from comparable interface.
		//compareTo() method in comparable interface is used to sort any kind of homogeneous data in default order
		
		
		//sort collection Objects based on id.
		
		//SORTING OBJECT BASED ON ID.
		
		//Syntax:-  Collections.sort(Collection name,Comparator object);
		
//		Comparator<ArrayListWithCollectionOfObjectsSortingWithBasedOnNumbers> c=(e1,e2)->(e1.id < e2.id)? -1 :(e1.id > e2.id)? 1 : 0;
//		Collections.sort(l,c);
		
		// or you can pass directly lambda expression to sort method.
		
		Collections.sort(l,(e1,e2)->(e1.id < e2.id)? -1 :(e1.id > e2.id)? 1 : 0);
		
		
		System.out.println(l);
		
		
		
	

	}

}
