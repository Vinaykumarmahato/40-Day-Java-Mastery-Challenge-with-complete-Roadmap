package Day1;

import java.util.Scanner;

class Hero{
	
	public void AllInOne() {
		
		int num1=10;
		double number=155424.46466;
		boolean check=true;
		float f=10.2f;
		char c='A';
		String Name="ADV Indian Coder";
		System.out.println("Num:"+num1);
		System.out.println(number);
		
		System.out.println(check);
		System.out.println(f);
		System.out.println(c);
		
		
	}
}

public class Data_Type {

	public static void main(String[] args) { 
		// 📅 Day 1: Variables, Data Types, and Operators
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
	Hero info=new Hero();
	
	info.AllInOne();
	
	System.out.println();
	// User Input Form
	Scanner Sc=new Scanner(System.in);
	System.out.println("Enter the name of the student");
	String Name=Sc.next();
	System.out.println("Enter the Age of the Stdent");
	int age=Sc.nextInt();
	System.out.println("Enter the Mobile Number Of the Student");
	long mob=Sc.nextLong();
	System.out.println("Enter The Father Name Of The Student");
	String FatherName=Sc.next();
	System.out.println("Enter The Mother Name of the Student");
	String MotherName=Sc.next();
	System.out.println("The name of the student is: "+Name);
	System.out.println("The Age of the Student Is:"+age);
	System.out.println("Mobile Number Is:"+mob);
	System.out.println("Father Name Is:"+FatherName);
	System.out.println("Mother Name Is:"+MotherName);
	
		

	}

}
