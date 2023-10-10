package HashMap;

import java.util.*;

public class Example {
    public static void main(String[] args) {

        Map<Integer , String> data= new HashMap<>();

            data.put(1, "Java");
            data.put(2, "Python");
            data.put(3, "JS");
            data.put(4, "C");
            data.put(5, "C++");

        System.out.println(data);

        // Retrieving values using keys
        System.out.println(data.get(3));

        //Getting the key set
        Set<Integer> keys= data.keySet();
        System.out.println("Keys is HashMAp"+keys);

        //Getting collection of values
        Collection<String>values = data.values();
        System.out.println(values);

//        Getting the entry set
        Set<Map.Entry<Integer,String>> entrySet=data.entrySet();

        //Iterating over entry set

        for (Map.Entry<Integer,String> obj: entrySet){
            Integer key= obj.getKey();
            String value = obj.getValue();
            System.out.println("Integer:"+keys+"Values:"+value);

        }
        //Iterating over entry set
        for(Map.Entry<Integer,String> obj:entrySet){
            System.out.println(obj.getValue());
        }
    }
}
