package Polymorphism;

public class Polymorphism {
//      Polymorphism Concepts
//
//      Function Overloading
    void Course_info(){System.out.println("Course  : Java");}

    void Course_info(String Topic){
        System.out.println("Topic : "+Topic);
    }
    void Course_info(int Unit){
        System.out.println("Unit :"+Unit);
    }
    void  Course_info(int fees ,String UnitName){
        System.out.println("Fees :"+fees);
        System.out.println("Unit Name :"+UnitName);
    }
}
