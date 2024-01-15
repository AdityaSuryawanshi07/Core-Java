
  //Write a Java program to create a class called "Person" with a name and age attribute.
  //Create two instances of the "Person" class, set their attributes using the constructor, and print their name and age.

package Assignment_3;

class Person{
    String Name;
    int Age;
    public Person(String Name,int Age){
        this.Name=Name;
        this.Age=Age;
    }

    public String getName(){
        return Name;
    }

    public int getAge() {
        return Age;
    }
}


public class OPPS_PersonDetails {
    public static void main(String []args){
    Person pn = new Person("Rahul", 21);
        Person pn1 = new Person("Sonu", 23);
        Person pn2 = new Person("Suraj", 20);

        System.out.println(pn.getName()+" is "+ pn.getAge()+" years old.");
        System.out.println(pn1.getName()+" is "+ pn1.getAge()+" years old.");
        System.out.println(pn2.getName()+" is "+ pn2.getAge()+" years old.");


    }

    }

