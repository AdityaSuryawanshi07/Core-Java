package Collection;

import java.util.ArrayList;

public class int_Arraylist {

    public static void main(String[] args) {

        ArrayList<Integer> data= new ArrayList<>();

        data.add(100);
        data.add(101);
        data.add(102);
        data.add(103);
        data.add(104);
        data.add(105);

       //to get 0-index value
        System.out.println(data.get(0));

        //to get whole data in array
        System.out.println(data);


        for (int i = 0; i < data.size(); i++) {
            // to get data in column
            System.out.println(data.get(i));

        }

        //Short form to print data in column
        for (int d :data ){
            System.out.println(d);
        }

    }
}
