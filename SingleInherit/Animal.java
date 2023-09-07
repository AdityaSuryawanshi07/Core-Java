package Inheritance.SingleInherit;

    class animall{
        void bark(){
            System.out.println("Dog can bark");
        }
    }

    class   dog extends animall{
        void eat(){
            System.out.println("Animal's can eat");
        }
    }
 public class Animal {
    public static void main(String[] args) {

        dog an=new dog();

        an.bark();
        an.eat();
    }
}
