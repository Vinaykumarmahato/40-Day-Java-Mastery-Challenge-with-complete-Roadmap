package Day3;

public class ImmutableString {
public static void main(String[] args) {
	
	// way of creating String
	// String name="ADV Indian Coder";
	// String name=new String("ADV Indian Coder";
	// StringBuilder name=new StringBuilder("ADV Indian Coder");
	String brand="ADV";
	System.out.println(brand);
	
	String name=new String("ADV");
	System.out.println(name);
	
	String s1="ADV";
	String s2="ADV";
	
	System.out.println(s1==s2); // true
	
	String s3="vinay kumar";
	String s4="vinay Kumar"; 
	System.out.println(s3==s4);  // false
	
	// if New use means it will be in heap area 
	// if new will not be use means it will be in SCP 
	
	
	
}
}


/*
 
SCP does not allows the duplicates
                 +-------------------+
        |    Heap Area      |
        +-------------------+
        |                   |
        |   SCP (String     |
        |   Constant Pool)  |
        |                   |
        +-------------------+
        |                   |
        |   "Hello"         |
        |   "World"         |
        |                   |
        +-------------------+
        |                   |
        |   SCP (String     |
        |   Constant Pool)  |
        |                   |
        +-------------------+
        |                   |
        |   "Hello"         |
        |   "World"         |
        |                   |
        +-------------------+
        |                   |
        |   Heap (Other     |
        |   Objects)        |
        |                   |
        +-------------------+
        |                   |
        |   New String      |
        |   Objects         |
        |                   |
        +-------------------+
        |                   |
        |   "Other String"  |
        |                   |
        +-------------------+



 */