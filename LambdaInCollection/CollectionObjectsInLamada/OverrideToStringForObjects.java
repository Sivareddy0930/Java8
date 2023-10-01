package LambdaInCollection.CollectionObjectsInLamada;

public class OverrideToStringForObjects {
		
	int id;
	String name;
	OverrideToStringForObjects(int id,String name){
		this.id=id;
		this.name=name;
	}
		
	//Overriding toString method.
	
	public String toString() {
		return id+":"+name;
	}
	
	public static void main(String[] args) {
		OverrideToStringForObjects obj=new OverrideToStringForObjects(1234,"Siva");
		System.out.println(obj);

	}

}
