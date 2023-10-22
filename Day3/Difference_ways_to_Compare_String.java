package Day3;

public class Difference_ways_to_Compare_String {
	
	public static void main(String[] args) {
		
		String s1="ADV Indian Coder"; // under the SCP
		
		String s2=new String("ADV Indian Coder"); // Outside SCP & under the Heap
		
		// == it is used to compare s1 & s2
		// s1.equals2 it compare actual value of s1 and s2
		
		System.out.println(s1==s2);// false
		System.out.println(s1.equals(s2)); // true
		
		
		String r1="adv";
		String r2="ADV";
		String r3="Adv";
		String r7="ADV";
		
		String r4=new String("ADV");
		String r5=new String("adv");
		String r6=new String("ADV");
		
		
		System.out.println(r1==r2);// false
		System.out.println(r1==r3); // False
		System.out.println(r2==r7);
		
		System.out.println(r4==r5);// False
		System.out.println(r4==r6);// false
		System.out.println(r4.equals(r6));// true
		
		System.out.println(r7.equals(r6)); // True
		
		
	}

}
