package Assignment_3;

import java.util.HashSet;

//        Write a Java program to append the specified element to the end of a hash set
public class Insert_Hash_set {
    public static void main(String[] args) {

        //Declare a hash set
        HashSet<String> hash = new HashSet<>();

        //add elements to set
        hash.add("Red");
        hash.add("Green");
        hash.add("Black");
        hash.add("White");
        hash.add("Pink");
        hash.add("Yellow");

        // Show elements of set
        System.out.println("Set :"+hash);

        //Remove a specified element
        hash.remove("White");
        System.out.println("Set : "+hash);

        // Add new element
        hash.add("Blue");
        System.out.println("updated set:"+hash);
    }
}
