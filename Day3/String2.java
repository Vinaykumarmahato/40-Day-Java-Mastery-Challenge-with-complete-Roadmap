package Day3;

public class String2 {
public static void main(String[] args) {
	
	String name="Vinay Kumar";
	System.out.println(name);
	name.concat("Java Developer");  // here we can't change after concatenation
	System.out.println(name);
	
	
	
	
	StringBuilder brand=new StringBuilder("ADV Indian Coder");
	System.out.println(brand);
	
	brand.append("Vinay Kumar");
	System.out.println(brand);
}
}
/*String:

it is an object.
it is collection of characters enclosed with double cots.
 Type of String
 
 (1)  Immutable :  Non Changeable  String

 (2) mutable :Changeable StringBuilder or StringBuffer

* */