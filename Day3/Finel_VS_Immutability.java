package Day3;

public class Finel_VS_Immutability {
	public static void main(String[] args) {
		
		int a=20;
		a=20;
		System.out.println(a);
		
		final int b=30;
	//	b=40; it will give compile time error
		System.out.println(b);
		
		
		final StringBuffer sb=new StringBuffer("ADV");
		
		sb.append("Indian");
		//System.out.println(sb);
		
		// sb=new StringBuffer("Indian");
		System.out.println(sb);
	}

}
