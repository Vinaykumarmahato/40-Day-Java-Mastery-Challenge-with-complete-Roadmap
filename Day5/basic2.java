package Day5;

public class Basic {
	
	public static void main(String[] args) {
		
		/*
		 syntax Error:
		 system.out.println(hiii); 
		 
		 Logical Error:
		 int a=10;
		 int b=20;
		 int result=a+b;
		 System.out.println(Multiple of two number is:"+result);
		 
		 Run Time Error:
		 int a=10;
		 int b=0;
		 System.out.println(a/b);
		 
		 Lets See a Real Life Example of Run time Error:
		 
		 Assume you have a file in your C drive and you are opening that file but already you have deleted 
		 and try to open in that time you will get a error called as run time error.
		 
 There are two type of statement in Exception
 1. Normal statement
 2. Critical Statement: The place where Exception Can be occur that place called as critical statement.
		 
		 * */
		
		
		int a=10;
		int b=0;
		try {
			int result=a/b;
		}
		catch(Exception e) {
			
			System.out.println(e);
			
		}
	
	}

}
