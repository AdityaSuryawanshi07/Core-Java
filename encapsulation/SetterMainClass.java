package encapsulation;

public class SetterMainClass {
    public static void main(String[] args) {
        GetSet getSet = new GetSet("Rahul",22,2500);
        System.out.println("Employee Name:"+getSet.getName());
        System.out.println("Employee Age:"+getSet.getage());
        System.out.println("Employee Salary:"+getSet.getSalary());

    }
}
