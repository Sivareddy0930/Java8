package doubleColonOperator;

import java.util.ArrayList;



 class MethodRefWithArbitaryObject {
	 
	

	 private String name;
	 private int age;
	 
	 public MethodRefWithArbitaryObject(String name, int age) {
			super();
			this.name = name;
			this.age = age;
		}
	
	public  int ageCompering(MethodRefWithArbitaryObject otherObject) {
		
		return Integer.compare(this.age, otherObject.age);
		
	}
	
	
	public String toString() {
		return name+" "+age;
		
	}

	public static void main(String[] args) {
		
		ArrayList<MethodRefWithArbitaryObject> al = new ArrayList();
		al.add(new MethodRefWithArbitaryObject("puppy",6));
		al.add(new MethodRefWithArbitaryObject("puppy",10));
		al.add(new MethodRefWithArbitaryObject("puppy",2));
		al.add(new MethodRefWithArbitaryObject("puppy",4));
		
		al.sort(MethodRefWithArbitaryObject::ageCompering);
		
		for(MethodRefWithArbitaryObject obj:al) {
			System.out.println(obj);
		}
	}

}
