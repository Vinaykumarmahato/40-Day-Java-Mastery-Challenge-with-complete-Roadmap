package DAy2;
import java.util.Scanner;

public class Solution5 {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Please Enter at which floor You want to go ");

        int buttom=sc.nextInt();

        switch(buttom){

            case 1: System.out.println("Thanks! You are Going on First Floor");
            break;
            case 2: System.out.println("Thanks! You are going on the second Floor");
            break;
            case 3: System.out.println("Thanks! You  are going on the Third Floor");
            break;
            case 4: System.out.println("Thanks! You are Going On the Fourth Floor");
            break;
            case 5: System.out.println("Thanks! You are Going On the Fifth Floor");
            default: System.out.println("Sorry! You ahve Entered Invalid Buttom ");
        }



    }
}
