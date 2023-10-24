package Day5;

public class Handling_The_Exception {
	
	public static void main(String[] args) {
		
		int a=6;
		int b=0;
		int result=0; // by default result will be 0
		
		try {
			
			result=a/b;
			System.out.println("In try Block"); // if no exception then only it can be Excute . 
//			 if exception,  then excution will jump in catch block it will not excute.
			
			
			  // if this block will be normal then it will direct move to the out of catch
			//			 block it will not enter in catch block for Excution , 
		}
		
		catch(Exception obj) {
			
			// what exception you are to get you can mention here
			System.out.println("Something went wrong"+obj); // if we want to know what exception occuring you can
			// print obj for knowing that.
			
		}
		
		// System.out.println(c); // here you are getting error because we have perform the operation in try block and 
		// scop for c will be end in that block only so we need to write int c=a/b; in main method;
		System.out.println(result);
		System.out.println("Bye");
	}

}
// Basically Exception is a class in java.
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
