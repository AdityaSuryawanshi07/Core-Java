package Assignment_3.Abstract_Birds;

 class Hawk extends Bird{
     @Override
     public void fly() {
         System.out.println("Hawk flying in the sky");
     }

     @Override
     public void makesound() {
         System.out.println("Hawk makes sound Caw caw!");
     }
 }
