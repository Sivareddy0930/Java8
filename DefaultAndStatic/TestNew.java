package DefaultAndStatic;


interface Interface3
{
    default void anyMethod()              
    {
        System.out.println("Hi... From Interface One");
    }
}
 
interface Interfacefour 
{
    default void anyMethod() 
    {
        System.out.println("Hi... From Interface Two");
    }
}
 
public class TestNew implements Interface3, Interfacefour
{
    @Override
    public void anyMethod()
    {
    	Interface3.super.anyMethod();
    }
     
    public static void main(String[] args) 
    {
        new TestNew().anyMethod();
    }
}
