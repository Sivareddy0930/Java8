package DefaultAndStatic;



interface Interf
{
//    default void anyMethod()              
//    {
//        System.out.println("Hi... From Interface One");
//    }
	
	//all methods in interfaces are public by default....
	public default void anyMethod()              
    {
        System.out.println("Hi... From Interface One");
    }
}
 

 
public class Test3 implements Interf
{
    @Override
    public void anyMethod()
    {
    	System.out.println("class method overrides both interface default methods.");
    }
     
    public static void main(String[] args) 
    {
        Test3 obj1=new Test3();
        obj1.anyMethod();
        
        Interf obj2=new Test3();
        obj2.anyMethod();
       
    }
}
