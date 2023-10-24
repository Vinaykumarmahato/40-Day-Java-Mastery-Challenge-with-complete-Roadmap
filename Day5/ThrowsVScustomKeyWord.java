package Day5;

public class ThrowsVScustomKeyWord {

	public static void main(String[] args) {
		
		int a=10;
		int b=2;
		
		try {
			
			
			if(b<0) {
				
				
				Exception e=new Exception();
				throw e;
				
			}
			
			else {
				int c=a/b;
				
				System.out.println(c);
			}
			
			
		}
		
		catch(Exception e) {
			System.out.println("Enter a valid number");
		}
		

	}

}

/*
i don't want to write this statement here i want to call the catch block here 
for excuting same message i have written in catch block for that we can write the key word
"throw"

for that we need to create the object of the exception 


 System.out.println("Enter a valid Number");

 
*/
