package Day5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FinalyBlock {
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		int number = 0;
		try {
			int number1=s.nextInt();
			s.close();

		}
		catch(InputMismatchException e) {
			
			System.out.println("Please! Enter a Number");
			s.close();
		}
		
		finally{
			
			s.close();
		}
		
		
		
		
		
		System.out.println(number);
		
	}

}


/*
 DRY: Do Not Repeat Yourself
 when try block Excute: when no Exception

 catch: When Exception

 finally: it always excute .
 Interview Question:


  
  can we write catch block and finally block without try block
  Ans: No
  
  
 can i remove finally block?
  Ans: Yes
 
 can we remove catch block?
 Ans: Yes
 
 Can we remove catch Block?
 
 Ans: Yes but finally block should be there then
  only we can remove the catch block. if finally 
  block will not be . then we can't remove catch block.
but the exception can't be handle,

we can write try block and finally block for closed the resource not for handle the exception.



 * */






