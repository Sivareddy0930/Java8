package LambdaInCollection.CollectionObjectsInLamada;

import java.util.ArrayList;

public class ArrayListWithCollectionOfObjects {
	
	int id;
	String name;
	ArrayListWithCollectionOfObjects(int id,String name){
		this.id=id;
		this.name=name;
	}
		
	//Overriding toString method.
	
	public String toString() {
		return id+":"+name;
	}
	
	public static void main(String[] args) {
		
		ArrayList l=new ArrayList();
		l.add(new ArrayListWithCollectionOfObjects(1234767,"Siva"));
		l.add(new ArrayListWithCollectionOfObjects(4567898,"Reddy"));
		l.add(new ArrayListWithCollectionOfObjects(8749812,"venkata"));
		l.add(new ArrayListWithCollectionOfObjects(4567854,"Tumu"));
		
		System.out.println(l);

	}

}
