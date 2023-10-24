package Day5;

public class multipleCatchBlock {
	
	public static void main(String[] args) {
		
		int a=8;
		int b=0;
		int c=0;
		// int value[]= {5,8,9,5};
		
		
		try {
			
			c=a/b;
			
			// System.out.println(value[5]);
		}
		
		// catch(Exception e) {
			
		// 	System.out.println("Stay in your limits");
	//  	}
		
         catch(Exception e) {
			
			System.out.println("Can't Devided by zero"+e);
		}
		
		System.out.println(c);
		System.out.println("Bye");
	}

}
