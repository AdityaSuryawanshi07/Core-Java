package Assignment_2;

import java.util.ArrayList;

public class Array_color {
    public static void main(String[] args) {



   // Write a Java program to create an array list, add some colors (strings) and print out the collection.

    ArrayList<String> color= new ArrayList<String>();

    color.add("Black");
    color.add("White");
    color.add("Pink");
    color.add("Blue");

        System.out.println("Colore in Array:"+color);

        color.add(2,"Violet");
        System.out.println("Colors :"+color);

       int size = color.size();
        System.out.println("total elements in Color:"+size);

        for (int i = 0; i < color.size(); i++) {
            System.out.println("Colors in  Coloumns:"+color.get(i));
        }
 }
}