package Day1;

public class Solution15 {
    
    public static void main(String[] args) {
        
        // Logical Operator
        /* 
         * AND Symbol is &&   T T T =T
         * OR  Symbol is ||  T F T T =T
         * NOT Symbol is !    True then False or False then True
         * 
         * Example 
         * int a10;
         * int b=20;
         * int c=30;
         * 
         * 
         */

         int a=10;
         int b=20;
         int c=30;

         System.out.println(a<b && b<c && c>a && b>a); // True
         System.out.println(a>b || b>c || c<a || a<c); // True
         System.out.println(!true); // False
         System.out.println(!false); // True

    }
}

