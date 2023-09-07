package Function.java;

public class Fun4 {

    int tax(int price,int gst) {
        gst = (price * gst) / 100;
        int mrp = gst + price;
        return mrp;
    }

    public static void main(String[] args) {
        Fun4 obj=new Fun4();
        int final_price=obj.tax(200,18);
        System.out.println(final_price);
    }

    }

