package Polymorphism;

public class Main {
    public static void main(String[] args) {
        Polymorphism obj = new Polymorphism();

        obj.Course_info();
        obj.Course_info("Polymorphism");
        obj.Course_info(23);
        obj.Course_info(4500);
        obj.Course_info("Advancejava");
    }
    Const_Poly constPoly = new Const_Poly();
    Const_Poly constPoly1 = new Const_Poly(22);
    Const_Poly constPoly2 = new Const_Poly("Coffee");
    Const_Poly constPoly3 = new Const_Poly("Tea");

}
