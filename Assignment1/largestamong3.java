package Assignment1;
import java.util.Scanner;
class largestamong3 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

        int num1 ,num2 ,num3;
        System.out.println("Enter first number:");
        num1 = sc.nextInt();

        System.out.println("Enter second number:");
        num2 = sc.nextInt();

        System.out.println("Enter third number:");
        num3 = sc.nextInt();

        if(num1>num2 && num1>num3) {
            System.out.println(num1+"-is largest number.");
        }else{
            if(num2>num1 && num2>num3){
                System.out.println(num2+"-is largest number.");
            }
            else{
                System.out.println(num3+"-is largest number.");
            }

        }

    }
}
