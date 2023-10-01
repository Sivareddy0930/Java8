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
		
		//for sorting based on numbers or characters we use compare() method that avaliable in Comparator interface.
		//for sorting based on  Strings we use compareTo() method that avaliable in String class.
		
		
		//sort collection Objects based on String.
		
		//SORTING OBJECT BASED ON Name.
		
		//Syntax:-  Collections.sort(Collection name,Comaparator object);
		
		Collections.sort(l,(e1,e2)->e1.name.compareTo(e2.name));
		
		
		System.out.println(l);
		
		
		
		
	

	}

}
