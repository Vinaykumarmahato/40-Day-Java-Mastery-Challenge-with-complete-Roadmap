package Day5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exceptionf {
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		int number = 0;
		try {
			int number1=s.nextInt();

		}
		catch(InputMismatchException e) {
			
			System.out.println("Please! Enter a Number");
		}
		
		
		System.out.println(number);
		
	}

}
