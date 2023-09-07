package Collection;

import java.util.ArrayList;

public class char_Arraylist {
    public static void main(String[] args) {


        ArrayList<String> data = new ArrayList<>();

        //Add method without index parameter.
        data.add("C++");
        data.add("Java");
        data.add("GO");
        data.add("JSP");

        //Access data from array data
        System.out.println(data.get(2));

        //Access all data from array
        System.out.println(data);

        for (int i = 0; i < data.size(); i++) {
            System.out.println(data.get(i));

        }for (String d : data){
            System.out.println(d);
        }

        // to replace element in array
        data.set(2 ,"Python");
        System.out.println(data);


        // Remove element from index
        String str = data.remove(3);
        System.out.println("After removing....="+data);
        System.out.println("removed data value..="+str);
    }
}