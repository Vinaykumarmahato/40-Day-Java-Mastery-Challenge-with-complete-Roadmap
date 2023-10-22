package Day4;

import java.util.Scanner;

public class Fun {
	public static int CalSum(int a, int b) {
		int Sum=a+b;
		return Sum;
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter The First Number");
		int a=s.nextInt();
		System.out.println("Enter The Second Number");
		int b=s.nextInt();
		int sum=CalSum(a,b);
		System.out.println("Addition of Two Number is:"+sum);
		
		
		
	}

}
