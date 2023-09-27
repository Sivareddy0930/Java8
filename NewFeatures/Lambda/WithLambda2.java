package NewFeatures.Lambda;

interface B{
	int test1(int a,int b);
}
public class WithLambda2  {

 public static void main(String[] args) {

//		B i=(int a,int b)->{return a+b;};
	 
	 B i=(a,b)-> a+b;
		
		System.out.println(i.test1(10,90));
		
		

	}

}
