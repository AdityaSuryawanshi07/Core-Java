package Assignment1;
import java.util.Scanner;

//  Write a Java program to get a number from the user and print whether it is positive or negative.
//  Use conditional statement.

public class Positive_Negetive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number:");
        int num = sc.nextInt();

        if(num > 0){
            System.out.println(num+" is Positive.");
        } else if (num < 0) {
            System.out.println(num+" is negative.");
        }else{
            System.out.println("0 is not positive & nor negative.");
        }

    }
}
