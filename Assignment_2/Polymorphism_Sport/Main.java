package Assignment_2.Polymorphism_Sport;


//        Write a Java program to create a base class Sports with a method called play().
//        Create three subclasses: Football, Basketball, and Rugby.
//        Override the play() method in each subclass to play a specific statement for each sport.

public class Main {
    public static void main(String[] args) {

        Sports sport = new Sports();
        Basketball basketball = new Basketball();
        Rugby rugby = new Rugby();
        Football football = new Football();

        sport.sport();

        football.sport();
        rugby.sport();
        basketball.sport();
    }
}
