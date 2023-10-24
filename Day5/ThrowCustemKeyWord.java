package Day5;

public class ThrowCustemKeyWord {

	public static void main(String[] args) {
		int number1=20;
		int number2=-2;
		
		try {
			
			if(number2<0) {
				Exception e = new Exception("Negative Number");
				throw e;
				
			}
			
			else {
				
				int result =number1/number2;
				System.out.println(result);

			}	
		}
		catch(Exception e) {
			
			System.out.println("Please! Enter a valid number"+e);
		}
		
		

	}

}
