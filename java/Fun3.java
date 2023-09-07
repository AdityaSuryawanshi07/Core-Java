package Function.java;

public class Fun3 {
    String setname(){
        return "joy";
    }
    int setPrice(){
     return 300;
    }

    public static void main(String[] args) {
        Fun3 obj = new Fun3();
        String name= obj.setname();
        System.out.println(name);
        System.out.println(obj.setPrice());
    }
}
