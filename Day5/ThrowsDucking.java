package Day5;

class Demo{
	
	public void A() throws Exception {
		
			B();
	
	}
	
	public void B() throws ArithmeticException
	{
		int num1=10;
		int num2=0;
		// try{
			
			int result=num1/num2;
			System.out.println(result);

		// }
		
		//catch(Exception e) {
			
			// System.out.println("Error"+e.getLocalizedMessage());
		}
		
}
public class ThrowsDucking {
public static void main(String[] args) {
	Demo d=new Demo();
	try{
		
		d.A();
	}
	
	catch(Exception e) {
		System.out.println("Error"+e.getLocalizedMessage());
		
	}
	
	
}
}

// Ducking: bhai tu kar de handle bhai tu kar de handle
