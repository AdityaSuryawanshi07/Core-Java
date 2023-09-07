package Aug_1_2023;
import java.util.*;
public class reeverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter five digits for reverse :");
       int num= sc.nextInt();
        int data[] = new int[num];


       while(true){
           int reverse;
           reverse= num%10*10+num;

           System.out.println(reverse);

        }



        }
    }

