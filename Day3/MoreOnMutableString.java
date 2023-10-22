package Day3;

public class MoreOnMutableString {
	public static void main(String[] args) {
		
		StringBuffer sb=new StringBuffer("ADV");
		sb.append("dsfcgfjdbdbkdbckdkbdfcbkdvk");
		System.out.println(sb.capacity());
		
		StringBuffer s=new StringBuffer("Vinay");
		System.out.println(s);// Vinay
		System.out.println(s.capacity()); // By default 16+5=21
		System.out.println(s.charAt(3));// a
		
		s.setCharAt(0,'v');
		System.out.println(s); // vinay
		
		StringBuilder V=new StringBuilder(150);
		System.out.println(V.capacity());// 150
		V.append("Vinay Kumar");
		System.out.println(V); // Vinay Kumar
		System.out.println(V.capacity());
		V.trimToSize();
		System.out.println(V);
		System.out.println(V.capacity());
		
		
		
		
	}
}
