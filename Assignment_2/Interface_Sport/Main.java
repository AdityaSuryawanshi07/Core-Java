package Assignment_2.Interface_Sport;



//        Write a Java program to create an interface Playable with a method play() that takes no arguments and returns void.
//        Create three classes Football, Volleyball, and Basketball that implement the Playable interface and override the
//        play() method to play the respective sports.

public class Main {
    public static void main(String[] args) {
        //    Create a instance for Football, VolleyBall and BasketBall.

        Playable football = new Football();
        Playable volleyball = new Volleyball();
        Playable basketball = new Basketball();

        // Call the "play" method on each Playable object to play different sports

        football.play();
        volleyball.play();
        basketball.play();
    }
}
