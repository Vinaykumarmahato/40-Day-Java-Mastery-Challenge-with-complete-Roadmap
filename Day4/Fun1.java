package Day4;

import java.util.Scanner;

public class Fun1 {
	
	public static int multiple(int a, int b) {
		
		return a*b;
	}
	
	public static void main(String[] args) {
		
		Scanner V=new Scanner(System.in);
		System.out.println("Enter The First Number");
		int a=V.nextInt();
		System.out.println("Enter The Second Number");
		int b=V.nextInt();
		System.out.println("Multiple Of Two Number Is:"+multiple(a,b));
		
		
	}

}
