package Assignment_3.Abstract_Birds;

//        Write a Java program to create an abstract class Bird with abstract methods fly() and makeSound().
//        Create subclasses Eagle and Hawk that extend the Bird class and implement the respective methods
//        to describe how each bird flies and makes a sound.

public class Main {
    public static void main(String[] args) {
        Bird eagle = new Eagle();
        Bird hawk = new Hawk();

        eagle.fly();
        eagle.makesound();

        System.out.println("--------------");

        hawk.fly();
        hawk.makesound();
    }
}
