package Inheritance.SingleInherit;


    class tax{
        void gst(){
            System.out.println("18%");
        }
    }
    class product extends tax{
        void productPrice(){
            System.out.println("300");
        }
    }
public class PrintBill {
    public static void main(String[] args) {

        product pd =new product();

        pd.productPrice();
        pd.gst();

    }
}
