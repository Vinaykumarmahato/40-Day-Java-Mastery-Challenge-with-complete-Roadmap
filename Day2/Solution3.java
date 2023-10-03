package DAy2;

public class Solution3 {
    public static void main(String[] args) {
        

        int a=10;
        int b=13;
        int c=123;
        int d=99;

        if(a>b && a>c && a>d)
        {
            System.out.println("A is Greater");
        }

        else if(a<b && a<c && a<d){

            System.out.println(" A is small");
        }

        else if(c>a){

            System.out.println("c is greater");
        }

        else{
            System.out.println("invalid data");
        }
    }
}
