package Assignment1;

//    Write a Java program to create an abstract class Animal with an abstract method called sound().
//    Create subclasses Lion and Tiger that extend the Animal class and implement the sound() method to make a specific sound for
//    each animal.

                // *************************************************************//

  // Add abstract class Animal
    abstract class Animal{
        //  Add abstract method sound
       public abstract void sound();
    }

    // Add subclass lion which extend Animal
    class lion extends Animal{
        public void sound(){
            System.out.println("Lions Roars !");
        }
    }

    // Add subclass tiger which extends Animal
    class Tiger extends Animal{
        public void sound(){
            System.out.println("Tiger Growls !");
        }
    }

    // Create main class
public class Abstract_Class {
    public static void main(String[] args) {

        //Create a object of absract class animal
        Animal lion = new lion();
        Animal Tiger = new Tiger();

        // Declare sound
        lion.sound();
        Tiger.sound();

    }
}
