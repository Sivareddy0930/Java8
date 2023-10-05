package Function_funtionalInterface;

import java.util.ArrayList;
import java.util.function.Function;

public class ObjectsWithFunction {
	
	String name;
	int marks;
	ObjectsWithFunction(String name,int marks){
		this.name=name;
		this.marks=marks;
	}

	public static void main(String[] args) {
			
		
		
		
		ArrayList<ObjectsWithFunction> al=new ArrayList();
		al.add(new ObjectsWithFunction("Siva",94));
		al.add(new ObjectsWithFunction("Bunny",65));
		al.add(new ObjectsWithFunction("munny",79));
		al.add(new ObjectsWithFunction("chinny",46));
		al.add(new ObjectsWithFunction("dumbu",38));
		
		//Assign Grading for corresponding marks;
		
		
		
		Function<Integer,String> fi=s->{
			if(s>=90) {
				return "Grade:-A";
			}
			else if(s>=80 && s<90 ){
				return "Grade:-B";
			}
			else if(s>=60 && s<80) {
				return "Grade:-C";
			}
			else if(s>=45 && s<60) {
				return "Grade:-D";
			}
			else  {
				return "Grade:-E";
			}
		};
		
		
		for(ObjectsWithFunction obj:al) {
			System.out.println(obj.name);
			System.out.println(obj.marks);
			System.out.println(fi.apply(obj.marks));
			System.out.println("---------------------------");
		}
		
	}

}
