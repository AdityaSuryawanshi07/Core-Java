package Assignment_3;
import java.util.*;
import java.util.Scanner;


// Question: Question: Create a java program that takes an array of integers as input and calculates the sum and average of its elements. Display the results.
// Expected Output:
//    Enter the number of elements in the array: 5
//    Enter the elements (separated by spaces): 10 20 30 40 50
//    Sum: 150
//    Average: 30

public class sum_average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements in the array: ");
        int num1;
        num1 = sc.nextInt();

        int sum[] = new int[num1];

        for (int i = 0; i < sum.length; i++) {
            System.out.println("Enter elements in array"+(i+1));
            sum[i] = sc.nextInt();
        }
        // Calculate sum
        int add = 0;
        for (int i = 0; i < sum.length; i++) {
            add = add+sum[i];

        }
        System.out.println("Adittion of elements is:"+add);

        int avg = 0;
        avg = add / num1;
        System.out.println("Average of elements is:"+avg);
        }

        }

