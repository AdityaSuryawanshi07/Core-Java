package Function.java;

public class Employe {

    public Employe(String EmpName,String city,int salary){
        System.out.println("Employe Name :"+EmpName);
        System.out.println("Employe City :"+city);
        System.out.println("Employe Salary :"+salary);
    }

    public static void main(String[] args) {
        Employe employe=new Employe("Rahul","Karad",4500);
        Employe employe2=new Employe("Deepak","Satara",2500);
        Employe employe3=new Employe("Abhijeet","Karjat",1500);
    }
}
