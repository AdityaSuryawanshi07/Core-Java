package Assignment_2.Speed_Polymorphism;


//        Write a Java program to create a class Vehicle with a method called speedUp().
//        Create two subclasses Car and Bicycle. Override the speedUp() method in each subclass
//        to increase the vehicle's speed differently.
public class Main {
    public static void main(String[] args) {



    Car car = new Car();
    Motarcycle motarcycle = new Motarcycle();

        System.out.println("Car initial speed is:"+car.getSpeed());
        System.out.println("Motorcycle initial speed is:"+motarcycle.getSpeed());

        car.speedUp();
        motarcycle.speedUp();

        System.out.println("\n Car speed after speeding up:"+ car.getSpeed());
        System.out.println("Motorcycle speed after speeding up:"+motarcycle.getSpeed());

 }
}