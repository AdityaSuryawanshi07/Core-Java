package Aug_1_2023;
import java.util.Scanner;
public class numberOfdigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num,count=0;
        System.out.println("Enter number:");
        num = sc.nextInt();


        while(num!=0)
        {
        num= num/10;
       count++;
        }

        System.out.println(count);
    }
}
