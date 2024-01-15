package Assignment_3.Abstract_Birds;

 class Eagle extends Bird{

     @Override
     public void fly() {
         System.out.println("Eagle fly top of the sky");
     }

     @Override
     public void makesound() {
         System.out.println("Eagle makes sound chir chir!");
     }
 }
