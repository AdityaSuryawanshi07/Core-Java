package basic.java;
import java.util.Scanner;
public class userInput {
    public static void main(String[] args) {
        Scanner adi = new Scanner(System.in);

        String name, address;
        int age;
        float height;
        char ltr;
        System.out.println("Enter your address");
        address = adi.nextLine();

        System.out.println("Enter your Name");
        name = adi.nextLine();

        System.out.println("Enter your age");
        age = adi.nextInt();

        System.out.println("Enter your height");
        height = adi.nextFloat();

        System.out.println("Enter your ltr");
        ltr = adi.next().charAt(0);

        System.out.println("Enter your name " + name);
        System.out.println("Enter your address " + address);
        System.out.println("Enter your age " + age);
        System.out.println("Enter your height " + height);
        System.out.println("Enter your ltr " + ltr);

    }
}






