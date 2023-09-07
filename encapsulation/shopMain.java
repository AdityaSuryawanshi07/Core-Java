package encapsulation;

public class shopMain {
    public static void main(String[] args) {
        Shop shop = new Shop();

        shop.setproduct("TV");
        System.out.println(shop.getproduct());

        shop.setPrice(2300);
        System.out.println(shop.getPrice());

        shop.setGst(18);
        System.out.println(shop.getGst());
    }
}
