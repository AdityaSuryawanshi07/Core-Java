package interfaces;


interface stdname {
    void getname();
}
public class student implements stdname {

    public void getname(){
        System.out.println("Aditya");
        System.out.println("Akash");
        System.out.println("Rahul");
    }


    public static void main(String[] args) {

      student std =new student();

      std.getname();
    }


}
