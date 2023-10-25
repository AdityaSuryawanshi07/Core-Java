package Assignment_2;

//1. Write a Java program to create an abstract class Animal with an abstract method called sound().
//        Create subclasses Lion and Tiger that extend the Animal class and implement the sound() method to make a specific sound
//        for each animal.
//

 abstract class animal{
     public abstract void sound();
 }

 class lion extends animal{
     @Override
     public void sound() {
         System.out.println("lion roars !");
     }
 }

 class tiger extends animal{
     public void sound(){
         System.out.println("Tiger growls!");
     }
 }

public class abstractClass_examle {
    public static void main(String[] args) {

        lion Lion = new lion();
        tiger Tiger = new tiger();

        Lion.sound();
        Tiger.sound();
    }
}
