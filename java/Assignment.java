package Function.java;
import java.util.stream.*;
import java.util.*;
public class Assignment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter number of Clients:");
        int item;
        item = sc.nextInt();

        String Name[] = new String[item];

        for (int i = 0; i < Name.length; i++) {

            System.out.println("Enter Client Name" + (i + 1));
            Name[i] = sc.next();



        }
    }
}





    //* Using Class Object
      //      --- input Section -------
    //    Enter Client List Size : 3

    //    Client Name 1 : Joy
    //    Client Name 2 : Suraj
    //    Client Name 3 : Sonu

    ////    Enter Joy List Size : 3
    //    Client Joy Product Name 1 : Cloth
    //    Client Joy Product Name 2 : Books
    //    Client Joy Product Name 3 : Pen

    //    Enter Suraj List Size : 3
    //    Client Suraj Product Name 1 : Toy
    //    Client Suraj Product Name 2 : Samosa
    //    Client Suraj Product Name 3 : Fafada

    //   Enter Sonu List Size : 2
    //   Client Sonu Product Name 1 : Pav
//    Client Sonu Product Name 2 : Dhokla

//     ---- OutPut --------
                    //    Product List of Joy
//    1 Cloth
//    2 Books
//    3 Pen
//    Product List of Suraj
//    1 Toy
//   2 Somosa
//   3 Fafada
//   Product List of Sonu
//  1 Pav
//  2 Dhokla




//