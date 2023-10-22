package Day1;
class Vinay{
	public void Add() {
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println("Addition Of A and B is:"+c);
		
	}
	
	public void sub() {
		
		
		int a=10;
		int b=20;
		int c=a-b;
		System.out.println("Sub Of A and B is:"+c);
	}
	
	public void mul() {
		int a=10;
		int b=20;
		int c=a*b;
		System.out.println("Mul Of A and B is:"+c);
	}
	
	public void div() {
		int a=10;
		int b=20;
		int c=a/b;
		System.out.println("Div Of A and B is:"+c);
	}
	
	public void Assignment() {
		
		int a=10;
		System.out.println("Value Add Karne se pahle"+a);
		a=a+5;
		System.out.println("Value Add Karne ke bad"+a);
		
		int b=55;
		b=b-5;
		System.out.println(b);
		
		int c=10;
		c=c/2;
		System.out.println(c);
	}
	
	public void Logical() {
		
		int a=10;
		int b=20;
		int c=10;
		// it gives the ans in true & false
		
		System.out.println(a==b && a==c && c==a && b==c); // AND ( && )
		System.out.println(a>b || a>c || c>=a); // OR ( || )
		System.out.println(!true); // NOT ( ! )
		
		
	}
	
	public void Relational() {
		int a=10;
		int b=39;
		int c=36;
		System.out.println(a==b);
		System.out.println(a>b);
		System.out.println(a<b);
		System.out.println(a>=b);
		System.out.println(a<=b);
		
		
		
	}
}
public class Operator {

	public static void main(String[] args) {
		Vinay v=new Vinay();
		v.Add();
		v.sub();
		v.mul();
		v.div();
		v.Assignment();
		v.Relational();
		

	}

}
//📅 Day 1: Variables, Data Types, and Operators
		// This is the first day of our Java programming journey. Today, we will focus on the fundamental building blocks of Java: variables, data types, and operators.

		// 📅 Variables
		// In Java, variables are used to store data. We will learn how to declare and initialize variables, including different data types like int, double, char, and more.

		// 📅 Data Types
		// Understanding data types is crucial. We'll explore primitive data types (int, double, boolean, etc.) and reference data types (String), and discuss their use in Java programs.

		// 📅 Operators
		// Operators are used for performing operations on variables and values. We'll cover arithmetic operators (+, -, *, /), relational operators (>, <, ==), and logical operators (&&, ||), among others.

		// 📅 Type Casting
		// Sometimes, you'll need to convert data from one type to another. We'll explain how type casting works in Java.

		// 📅 Expressions and Statements
		// In Java, expressions and statements play a vital role in building your programs. We'll explore what they are and how to use them effectively.

		// 📅 Practice and Hands-On
		// To solidify our understanding, we will work on practical exercises and coding examples to apply what we've learned today.