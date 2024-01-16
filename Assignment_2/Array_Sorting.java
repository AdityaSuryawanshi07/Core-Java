package Assignment_2;

import java.util.Arrays;

//      Write a Java program to sort a numeric array and a string array.
public class Array_Sorting {
    public static void main(String[] args) {

        //  Declare and initialize an integer array.
        int[] numeric = {
          1211 , 2210 , 2030,
          1020 , 1234 , 2233
        };

        // Declare and initialize string array.
        String[] strings ={
          "Blue" , "Red" , "Banana" ,
          "Cat" , "Spoon" , "Jam"
        };

        // Print a original Integer array
        System.out.println("Original Integer array :"+ Arrays.toString(numeric));

        // To  short array
        Arrays.sort(numeric);
        System.out.println("Sorted Integer Array :"+ Arrays.toString(numeric));

        System.out.println("------------------------------------------------------------");

        // Print a original String array
        System.out.println("Original Integer array :"+ Arrays.toString(strings));

        // To  short array
        Arrays.sort(strings);
        System.out.println("Sorted Integer Array :"+ Arrays.toString(strings));
    }
}
