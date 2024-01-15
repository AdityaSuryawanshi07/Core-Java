package Assignment_3.Encapsulation_Bank;

 class BankAccount_sub {

     // Create private instance account number & balance
    private String acccountNumber;
    private double balance;

     // create its Getter and Setter

     public String getAcccountNumber() {

         return acccountNumber;
     }

     public void setAcccountNumber(String acccountNumber) {

         this.acccountNumber = acccountNumber;
     }

     public double getBalance() {

         return balance;
     }

     public void setBalance(double balance) {
         this.balance = balance;
     }
 }
