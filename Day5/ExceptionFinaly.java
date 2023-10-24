package Day5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionFinaly {
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		
		try {
			int number=s.nextInt();

		}
		catch(InputMismatchException e) {
			
			System.out.println("Please! Enter a Number");
		}
		System.out.println("Enter the number");
		
	}

}
