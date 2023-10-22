package Day3;

public class InbuiltMethodInJava {
public static void main(String[] args) {
	
	String str="ADV Indian Coder";
	System.out.println(str);//ADV Indian Coder

	System.out.println(str.toUpperCase());// ADV INDIAN CODER 
	System.out.println(str.toLowerCase());//adv indian coder


	System.out.println(str.length());//16
	System.out.println(str.charAt(2));//V
	System.out.println(str.substring( 0,4)); // ADV
	System.out.println(str.indexOf("i"));//7
	
	System.out.println(str.lastIndexOf("r")); //15
	}
}
