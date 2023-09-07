package Aug_1_2023;
import java.util.*;
public class multiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;
        System.out.println("Enter number for Table:");
        num = sc.nextInt();

        int i;
        for(i = 1; i <= 10; i++)
            {
            System.out.println((num+"*"+i+"=")+i*num );
        }
        System.out.println("==Welcome==");
        }
    }
