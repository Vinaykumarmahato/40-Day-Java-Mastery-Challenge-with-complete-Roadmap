package Day1;

public class Solution18 {
    
    public static void main(String[] args) {
        
        int vinay=10;
        int shahu=20;

        String Love=(vinay<shahu)? "Vinay is less":"Shahu is less";

        System.out.println(Love);



        int a=10;
        int b=20;
        int c=30;

        int name=(a<b)? (a<c ? a:b ):(b<c ? b:c);
        System.out.println(name);
    }
}
