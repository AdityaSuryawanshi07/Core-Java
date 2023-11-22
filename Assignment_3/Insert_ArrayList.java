package Assignment_3;


//Write a Java program to insert an element into the array list at the first position
//ex- Red,Green,Orange,White,Black
//    Insert Pink at 1 and Yellow at 5

import java.util.ArrayList;
import java.util.List;

public class Insert_ArrayList {
    public static void main(String[] args) {

        List <String> list_color = new ArrayList<>();

        list_color.add("Red");
        list_color.add("Green");
        list_color.add("Orange");
        list_color.add("White");
        list_color.add("Black");

        System.out.println("Elements in list:"+list_color);

        // Add Pink & Yellow

        list_color.add(0,"Pink");
        list_color.add(5,"Yellow");
        System.out.println("Updated List:"+list_color);


    }
}
