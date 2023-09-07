package Function.java;

public class Student {

    public Student(String name,String city,float percentage){
        System.out.println("Student name: "+name);
        System.out.println("Student Address: "+city);
        System.out.println("Student Percentage: "+percentage);
    }

    public static void main(String[] args) {
        Student student=new Student("Akash","Satara",60.2f);
        Student student1=new Student("Aditya","Karad",73.4f);
        Student student2=new Student("Amar","Junnar",70.2f);
    }
}
