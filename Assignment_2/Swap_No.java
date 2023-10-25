package Assignment_2;
import java.util.*;

public class Swap_No {
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);

        int a , b ;
        int c;

        System.out.println("Enter Number 1: A =");
        a = sc.nextInt();

        System.out.println("Enter Number 2: B =");
        b = sc.nextInt();

        System.out.println("Before swapping :"+"A = "+a + " ||B = "+b);
        c = a;
        a = b;
        b = c;
        System.out.println("After swapping :"+"A = "+a + " ||B = "+b);
    }


}
