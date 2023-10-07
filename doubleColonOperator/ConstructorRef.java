package doubleColonOperator;

//If Suppose functional interface method return an object of class.
//At this point we use Constructor reference.
//it is easy form or alternative form of LAMBDA expression.

//REference of static method ====> ClassNAme::MethodName;
//Reference of Instance Method ===> object of Corresponding class :: methodName;
//Reference of a constructor  ===>ClassNAme::new;


//Arguments are must be same in both interface method and provided constructor(constructor we are referring).
//no need to check about rest of things like AccesModifier and name of constructor.

//Here our m1() method implementation is Constructor of Message.


interface A{
	Message m1();
}
class Message{
	Message(){
		System.out.println("Message class constructor");
	}
}

public class ConstructorRef {
	

	public static void main(String[] args) {
		
			A r = Message :: new;
			r.m1();
			
			//Message constructor is the implementation of m1() method in interface A.
	}

}
