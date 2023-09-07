package Function.java;

public class Course {

    Course(){
        System.out.println("suryawanshiadi07@gmail.com");
    }
    Course(String web){
        System.out.println("This is website : "+web);
    }

    public static void main(String[] args) {
        Course course=new Course();
        Course course1= new Course("suryawanshiadi07@gmail.com");
    }
}
