package Assignment_2;


 class employe{
     String name;
     int age;
     int salary;

     public String getName(){
return name;
     }
     public int getAge(){
         return age;
     }
     public int getsalary(){
         return salary;
     }



        public employe(String Name,int Age,int Salary){
            this.age=Age;
            this.name=Name;
            this.salary=Salary;

        }

 }
public class encapsulation_example {
    public static void main(String[] args) {
        employe Employe  =new employe("Aditya", 21, 1500);
        String Name = Employe.getName();
        int Age=Employe.getAge();
        int Salary=Employe.getsalary();

        System.out.println("Name="+Name);
        System.out.println("Age="+Age);
        System.out.println("Salary="+Salary);
    }

}