package Assignment_3.Inheritance_Drive;

//        Write a Java program to create a class called Vehicle with a method called drive().
//        Create a subclass called Car that overrides the drive() method to print "Repairing a car".
//        This program creates a class called 'Vehicle' with a method called drive() and a subclass called Car
//        that overrides the drive() method to print "Repairing a car".

public class Main {
    public static void main(String[] args) {

        Vehicle vechile = new Vehicle();
        Car car = new Car();

        vechile.drive();
        car.drive();
    }
}


//   Answer : - 1. First create a subclass Vehicle with methode drive.
//              2. Second add another subclass named Car which extends vehicle and overrides method Drive
//              3. Now create an object of both subclasses and call that  method.
