package ExceptionHandling;
import java.util.InputMismatchException;
import java.util.Scanner;
public class tryCatch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String name;
        int age;
        int height;

        try {
            System.out.println("Enter name:");
            name = sc.next();

            System.out.println("Enter age:");
            age = sc.nextInt();

            System.out.println("Enter height:");
            height = sc.nextInt();

            System.out.println(name);
            System.out.println(age);
            System.out.println(height);
        }catch (InputMismatchException e){
            System.out.println("Enter height in cm");
        }
    }
}