package Assignment_3;

import java.util.ArrayList;
import java.util.Collections;

public class SwapUsing_Arraylist {
    public static void main(String[] args) {

        ArrayList<String>  Colors= new ArrayList();

        Colors.add("Blue");
        Colors.add("Orange");
        Colors.add("Red");
        Colors.add("Yellow");
        Colors.add("Black");

        System.out.println("Arraylist Before swap");
        for(String a : Colors){
            System.out.println(a);
        }

        System.out.println("__");

        Collections.swap (Colors , 1,3);
        System.out.println("Array list After swap");

        for(String a : Colors){
            System.out.println(a);
        }
    }
}
