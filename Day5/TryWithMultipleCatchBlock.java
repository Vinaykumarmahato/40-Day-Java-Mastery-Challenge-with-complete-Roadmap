package Day5;

public class TryWithMultipleCatchBlock {
	public static void main(String[] args) {
		int a=10;
		int b=2;
		int result=0;
		
		int arr[]= {2,5,4,7};
		
		try {
			result=a/b;
			System.out.println(arr[5]);
			
		}
		
		catch(ArithmeticException e) {
			
			System.out.println("Can't devide by zero"+e);
		}
		
		catch(ArrayIndexOutOfBoundsException e) {
			
			System.out.println("Stay in your limits");
		}
		
		System.out.println(result);
		
		System.out.println("Bye");
	}

}
