package Day5;
class MyException extends Exception{
	public MyException() {}
	public MyException(String msg) {
		
		super(msg);
	}
}

public class CustomExceptionCreation {
	
	public static void main(String[] args) {
		
		int a=20;
		int b=-7;
		
		try {
			
			if(b<0) {
				
				Exception e=new MyException("Negative Number");
				throw e;

			}
			else {
				int c=a/b;
				System.out.println(c);
			}
			
		}
		catch(Exception e) {
			
			System.out.println("Hey man Enter a Posetive number"+e);
		}
	}

}
