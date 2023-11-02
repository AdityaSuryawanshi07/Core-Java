package Abstract_Classes;

 // Declare a abstract class class

 abstract class Class{
     // Create a abstract method contains.
    public abstract void contains();
        }

        // Create subclass students
  class students extends  Class{
     //Create method contains.
     public void contains(){
         System.out.println("Class contains 60 students");
     }
        }

        // Create teacher class that extends Class
        class teachers extends Class{
     public void contains(){
         System.out.println("Class contains 2 teachers");
     }
        }


public class School_Abstract {
    public static void main(String[] args) {
        Class std = new students();
        Class tech = new teachers();

        std.contains();
        tech.contains();
    }




}
