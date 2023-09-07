package encapsulation;

public class Client {
    String Name;
    int Price;
    public Client(String Name,int Price){
        this.Price = Price;
        this.Name = Name;
    }
    public int getPrice(){
        return Price;

    }
    public String getName(){
        return Name;
    }
}
