package basic.java;
import java.util.Scanner;
class add {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        int a;
        int b;
        int sum;

        System.out.println("Enter first number:" );
        a = sc.nextInt();
        System.out.println("Enter second number:" );
        b = sc.nextInt();

        sum=a+b;
        System.out.println(sum);

    }

}