package LambdaInCollection.CollectionObjectsInLamada;

import java.util.*;

public class ArrayListWithCollectionOfObjectsSortingWithBasedOnString {
	
	int id;
	String name;
	ArrayListWithCollectionOfObjectsSortingWithBasedOnString(int id,String name){
		this.id=id;
		this.name=name;
	}
		
	//Overriding toString method.
	
	public String toString() {
		return id+":"+name;
	}
	
	public static void main(String[] args) {
		
		ArrayList<ArrayListWithCollectionOfObjectsSortingWithBasedOnString> l=new ArrayList();
		  
		l.add(new ArrayListWithCollectionOfObjectsSortingWithBasedOnString(1234767,"Siva"));
		l.add(new ArrayListWithCollectionOfObjectsSortingWithBasedOnString(4567898,"Reddy"));
		l.add(new ArrayListWithCollectionOfObjectsSortingWithBasedOnString(8749812,"venkata"));
		l.add(new ArrayListWithCollectionOfObjectsSortingWithBasedOnString(4567854,"Tumu"));
		
		System.out.println(l);
		//for sorting based on numbers or characters in custom format we use compare() method that available in Comparator interface.
		//for sorting based on  Strings we use compareTo() method that available in String class.which is overridden from comparable interface.
		//compareTo() method in comparable interface is used to sort any kind of homogeneous data in default order
		
		//sort collection Objects based on String.
		
		//SORTING OBJECT BASED ON Name.
		
		//Syntax:-  Collections.sort(Collection name,Comparator object);
		
//		Comparator<ArrayListWithCollectionOfObjectsSortingWithBasedOnString> c=(e1,e2)->e1.name.compareTo(e2.name);
//		//(e1,e2)->e1.name.compareTo(e2.name) this represent compare() method .
//		Collections.sort(l,c);
		
		// or you can pass directly lambda expression to sort method.

		Collections.sort(l,(e1,e2)->e1.name.compareTo(e2.name));
		
		
		System.out.println(l);
		
		
		
		
	

	}

}
