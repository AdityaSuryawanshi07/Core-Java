package encapsulation;

public class ClientMainClass {
    public static void main(String[] args) {
        Client client = new Client("Aditya",300);
        System.out.println(client.getName());
        System.out.println(client.getPrice());
    }
}
