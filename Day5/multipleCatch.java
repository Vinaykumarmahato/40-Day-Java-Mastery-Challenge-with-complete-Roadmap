package Day5;

public class multipleCatch {
	
	public static void main(String[] args) {
		
		int a=15;
		int b=0;
		int c=0;
		
		int arr[]= {4,8,5,7};
		
		String name=null;
		
		try {
			
			c=a/name.length();
			System.out.println(arr[5]);
			
		}
		
         catch(ArithmeticException e) {
			
			System.out.println("Can Not Devide by zero:"+e);
		}
		
		
		catch(ArrayIndexOutOfBoundsException e) {
			
			System.out.println("Stay in Limits"+e);
		}
		
		catch(Exception e) {
			System.out.println("Something went wrong"+e);
		}
		
		
		System.out.println(c);
		System.out.println("Bye");
	}

}
