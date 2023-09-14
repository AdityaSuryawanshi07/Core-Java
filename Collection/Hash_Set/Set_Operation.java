package Collection.Hash_Set;

import java.util.HashSet;
import java.util.Set;

// program in Hash set file
public class Set_Operation {
    public static void main(String[] args) {

        //Union

        Set<Integer> data1 = new HashSet<>();
        data1.add(1);
        data1.add(2);
        data1.add(3);
        data1.add(4);
        data1.add(5);

        Set<Integer> data2 = new HashSet<>();
        data2.add(1);
        data2.add(102);
        data2.add(105);
        data2.add(103);
        data2.add(104);
        data2.add(4);

        System.out.println("Data1 set : "+data1);
        System.out.println("Data2 set : "+data2);

        //To make union of 2 set.
//  **      data2.addAll(data1);
//  **     System.out.println("Union :"+data2);

        //Intersection
        System.out.println("Intersection :");
        data2.retainAll(data1);
        System.out.println("Intersection"+data2);

        //Subset
        System.out.println("Contains all");

        data1.containsAll(data2);
        System.out.println(data2);
    }

}
