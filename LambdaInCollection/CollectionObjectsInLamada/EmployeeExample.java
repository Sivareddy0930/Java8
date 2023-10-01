package LambdaInCollection.CollectionObjectsInLamada;

import java.util.*;

public class EmployeeExample {
	
	int id;
	int Salary;
	EmployeeExample(int id,int Salary){
		this.id=id;
		this.Salary=Salary;
	}
		
	//Overriding toString method.
	
	public String toString() {
		return id+":"+Salary;
	}
	
	public static void main(String[] args) {
		
		ArrayList<EmployeeExample> l=new ArrayList();
		  
		l.add(new EmployeeExample(4,80000));
		l.add(new EmployeeExample(1,50000));
		l.add(new EmployeeExample(5,80000));
		l.add(new EmployeeExample(6,50000));
		l.add(new EmployeeExample(7,80000));
		l.add(new EmployeeExample(8,70000));
		l.add(new EmployeeExample(3,70000));
		l.add(new EmployeeExample(2,60000));
		
		System.out.println(l);
		
		//Find second highest salary from employee object.
		
//		Collections.sort(l,(e1,e2)->(e1.Salary<e2.Salary)? -1 :(e1.Salary>e2.Salary)? +1 :0);//Ascending order
		
		Collections.sort(l,(e1,e2)->(e1.Salary<e2.Salary)? +1 :(e1.Salary>e2.Salary)? -1 :0);
		
		
		System.out.println(l);
		
		
		 for (int i = 1; i < l.size(); i++) {
	            if (l.get(i).Salary != l.get(0).Salary) {
	                System.out.println("Second Highest salary:-"+l.get(i).Salary);
	                break;
	            }
	        }
		
		
		
		
	

	}

}
