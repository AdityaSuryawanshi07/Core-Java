package Assignment_2.Inharitance_example;

//Write a Java program to create a class called Animal with a method called makeSound().
//        Create a subclass called Cat that overrides the makeSound() method to bark.

public class Main {
    public static void main(String[] args) {
        Animal an = new Animal();
        Bird br = new Bird();

        an.makesound();
        br.makesound();
    }
}
