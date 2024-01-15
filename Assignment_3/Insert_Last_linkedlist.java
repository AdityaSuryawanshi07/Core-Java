package Assignment_3;


import java.util.LinkedList;

//        Write a Java program to insert the specified element
//        at the end of a linked list.

public class Insert_Last_linkedlist {
    public static void main(String[] args) {

        LinkedList<String> color = new LinkedList<>();

        color.add("Red");
        color.add("Blue");
        color.add("Yellow");
        color.add("Black");

        System.out.println("First List:"+color);

        //  Now we have to add element at last

        color.addLast("Pink");
        System.out.println("Element added at last :"+color);
    }
}
