package encapsulation;

public class GetSet {
    String Name;
    int age;
    int salary;
    public GetSet(String Name,int age,int salary){
        this.Name=Name;
        this.age=age;
        this.salary=salary;

    }
    public String getName(){return Name;}
    public int getage(){return age;}
    public int getSalary(){return salary;}

    public void setName(String Name){this.Name=Name;}
    public void setage(int age){this.age=age;}
    public void setSalary(int salary){this.salary=salary;}

}
