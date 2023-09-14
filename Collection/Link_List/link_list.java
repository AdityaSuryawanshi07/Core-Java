package Collection.Link_List;
// === programe of linked list
import java.util.LinkedList;
import java.util.List;

public class link_list {
    public static void main(String[] args) {


        // create a list using linkedList classes
        List<Integer> numbers = new LinkedList<>();

        //Add elements to list
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        System.out.println("List :"+numbers);

        //Access number from list

        int number = numbers.get(2);
        System.out.println("Accessed Element :"+number);

        //using index method
        int index = numbers.indexOf(3);
        System.out.println("Position of 3 is:"+ index);

        //Remove element from list
        int removeNum = numbers.remove(3);
        System.out.println("removed number  is:"+removeNum)
        ;
    }
}
