package Day3;

public class StringConcatenate {
public static void main(String[] args) {
	
	String s1=new String("ADV");
	s1=s1.concat("Indian");
	System.out.println(s1); // stored into heap area
	
	String r1="ADV Java";
	r1.concat("Progarm");
	System.out.println(r1); // ADV Java
	r1=r1.concat("Program");
			System.out.println(r1); // ADV javaProgram
	String r2="Coder";
	
	r2=r2.concat("Indian");
	System.out.println(r2); // CoderIndian
	
	String name="Vinay"+"Kumar";
	System.out.println(name);
	
	String name1="ADV"+"Indian"+"coder";
	System.out.println(name1);
	name=name+name1;
	System.out.println(name);
	
}
}
