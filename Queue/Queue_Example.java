package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class Queue_Example {

    public static void main(String[] args) {

        //Create queue using linked List
        Queue<String> queue = new LinkedList<>();

        //1.Add elements
        queue.add("First 1");
        queue.offer("Second 1"); //Offer is also used for add
        queue.offer("Second 2");
        queue.offer("Second 3");
        queue.offer("Second 4");

        System.out.println(queue);

        queue.remove(); //it removes first element in queue
        System.out.println(queue);

        queue.poll(); // poll also used for remove
        System.out.println(queue);

        System.out.println(queue.peek());  // it is used for display first element
        System.out.println(queue);

    }
}
