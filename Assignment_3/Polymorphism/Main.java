package Assignment_3.Polymorphism;


//        Write a Java program to create a base class Animal (Animal Family) with a method called Sound().
//        Create two subclasses Bird and Cat. Override the Sound() method in each subclass to make a
//        specific sound for each animal.

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();

        Bird bd = new Bird();
        Cat ct  = new Cat();

        animal.sound();
        bd.sound();
        ct.sound();

    }
}
