package encapsulation;

public class Shop {
    String product;
    int price;
    int gst;

    void setproduct(String product){
        this.product=product;
    }
    String getproduct(){
        return product;
    }
    void setPrice(int price){
        this.price=price;
    }
    int getPrice(){
        return price;
    }
    void setGst(int gst){
        this.gst=gst;
    }
    int getGst(){
        return gst;
    }
}
