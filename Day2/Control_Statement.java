
package Day2;

import java.util.Scanner;

class All{
	
	public void If() {
		System.out.println("This is for If Block");
		int a=20;
		int b=30;
		if(a>b) {
			System.out.println("A is Greater");
		}
		else {
			System.out.println("B is Greater");
		}
		
	}
	
	public void If_Else() {
		System.out.println("This is for if else block");
		int a=29;
		int b=45;
		int c=67;
		if(a>=b && a>=c) {
			System.out.println("A is greater");
		}
		else if(b>=a &&b>=c) {
			System.out.println("B is Greater");
		}
		else {
			System.out.println("C is The Greatest Value");
		}
	}
	
	public void Switch() {
		
		Scanner c=new Scanner(System.in);
		System.out.println("Switch operation start");
		System.out.println("At first lets see a normal code");
		int casecheck=100;
		switch(casecheck) {
		case 200: System.out.println("Case 1");
		break;
		case 100: System.out.println("Case 2");
		break;
		default:System.out.println("Case Not Matching");
		}
		
	 
		System.out.println("Now A normal Console base Application for emplementing switch operation");
		
		System.out.println("please Enter the Floor Number! where you want to go");
		int buttom=c.nextInt();
		
		switch(buttom) {
		
		case 1: 
	        System.out.println("👍 Thank You! You are going on First floor.");
	        break;
	    case 2: 
	        System.out.println("👍 Thank You! You are going on Second Floor");
	        break;
	    case 3: 
	        System.	out.println("👍 Thank You! You are going on Third floor");
	        break;
	    case 4: 
	        System.out.println("👍 Thank You! You are going on Fourth floor");
	        break;
	    case 5: 
	        System.out.println("👍 Thank You! You are going on Fifth Floor");
	        break;
	    case 6: 
	        System.out.println("👍 Thank You! You are Going on Sixth floor");
	        break;
	    default: 
	        System.out.println("😞 Ohh! Sorry You have entered the wrong Button");
	        
		}	 	
	}
	
	public void ForLoop() {
		System.out.println("For Loop Started");
		int number;
		for(number=0;number<=30; number++) {
			
			System.out.println(number);
		}
		
	}
	
	public void AnotherForLoopExample1() {
        System.out.println("Multiplication Table of 2:");
        
        int num = 2; 
        int limit = 10; 
        for (int i = 1; i <= limit; i++) {
            int result = num * i;
            System.out.println(num + " x " + i + " = " + result);
	}	
}
	
	public void AnotherForLoopExample2() {
        System.out.println("Multiplication Table of 3:");
        
       int number=3;
       int limit=10;
       int result;
       
       for(int i=1;i<=limit;i++) {
    	   
    	   result=number*i;
    	   System.out.println(number+"X"+i+"="+result);
       }
		
	}
	
	public void AnotherForLoopExample3() {
	    System.out.println("Multiplication Table of 3:");
	    
	  int Number=1;
	  int Limit=10;
	  int result;
	  for(int i=1;i<=Limit;i++) {
		  
		  result=Number*i;
		  System.out.println(result);
		  
	  }	
	}
	
	public void AnotherForLoopExample4() {
		
		int num=1;
		int limit = 10;
		int result;
		for(int  i=1;i<=limit;i++) {
			result=num*i;
			
			System.out.println(result);
			
			
		}
		
		
	}
	
	public void ForLoopAgain() {
		
		for(int i=1; i<=20;i++) {
			System.out.println(i);
		}
	}
	
	public void WhileLoop0() {
		int i=1;
		while(i<=20) {
			System.out.println("I Love You");
			i++;
			
		}
	}
	
	public void WhileLoop1() {
		int vinay=1;
		while(vinay<=20);
		System.out.println("Vinay Kumar Java Developer");
		vinay++;
	}
}


	
public class Control_Statement {
	
	public static void main(String args[]) {
		
		All A=new All();
		//A.If();
		//A.If_Else();
		//A.Switch();
		//A.ForLoop();
		// A.AnotherForLoopExample1();
		// A.AnotherForLoopExample2();
		// A.ForLoopAgain();
		//A.WhileLoop0();
		A.WhileLoop1();
	}
}
//📅 Day 2: Control Statements (if, switch, loops)
//On the second day of our Java programming journey, we'll delve into control statements. These are crucial for controlling the flow of your code based on different conditions.

//📅 if Statements
//We'll start with "if" statements, which allow you to execute code blocks conditionally. You can choose different paths based on whether a condition is true or false.

//📅 switch Statements
//"Switch" statements are handy when you have multiple conditions to evaluate against a single expression. We'll see how to use "switch" to make decisions efficiently.

//📅 for Loop
//The "for" loop is excellent for iterating through a range of values, such as arrays or when you know how many times you want to execute a block of code.

//📅 while Loop
//We'll explore the "while" loop, which repeatedly executes a code block as long as a specified condition remains true.

//📅 do-while Loop
//The "do-while" loop is similar to the "while" loop, but it ensures at least one execution of the code block, even if the condition is initially false.

//These control statements are powerful tools for building dynamic and responsive Java programs.

//📅 Practice and Hands-On
//To reinforce our knowledge, we will work on practical exercises and coding examples to apply what we've learned about control statements.






