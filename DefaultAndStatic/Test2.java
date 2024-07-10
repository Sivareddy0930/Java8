package DefaultAndStatic;



interface Interface5
{
    default void anyMethod()              
    {
        System.out.println("Hi... From Interface One");
    }
}
 
interface Interface6 
{
    default void anyMethod() 
    {
        System.out.println("Hi... From Interface Two");
    }
}
 
public class Test2 implements Interface5, Interface6
{
    @Override
    public void anyMethod()
    {
    	System.out.println("class method overrides both interface default methods.");
    }
     
    public static void main(String[] args) 
    {
        Test2 obj1=new Test2();
        obj1.anyMethod();
        
        Interface5 obj2=new Test2();
        obj2.anyMethod();
        
        Interface6 obj3=new Test2();
        obj3.anyMethod();
    }
}
