package Assignment_3.Encapsulation_Bank;

//Write a Java program to create a class called BankAccount with private instance variables accountNumber and
//balance. Provide public getter and setter methods to access and modify these variables.

public class Bank_Main {

    public static void main(String[] args) {

        //Create an object of subclass

        BankAccount_sub bank = new BankAccount_sub();

        // Set value by set method
        bank.setAcccountNumber("Ibkl-204");
        bank.setBalance(2400);

        // GEt value by get method
        System.out.println("Your account number is -"+bank.getAcccountNumber());
        System.out.println("Your bank balance is -"+bank.getBalance());

        bank.getBalance();


    }
}
