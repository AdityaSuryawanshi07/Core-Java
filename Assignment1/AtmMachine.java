package Assignment1;
import java.util.*;
public class AtmMachine {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            System.out.println("First enter last four number of card:");

            int setPin;
            System.out.println("Set Pin:");
            setPin = sc.nextInt();

            int enterPin;
            System.out.println("Enter Your Pin:");
            enterPin = sc.nextInt();

            if (setPin == enterPin) {
                int amount;
                System.out.println("Enter Amount to withdraw:");
                amount = sc.nextInt();

                if (amount <= 10000){
                    System.out.println("Your withdrawed money is:"+amount);
                }else {
                    System.out.println("If amount is bigger than $10.000 ,Plz make payment from your Bank");
                }
            } else {
                System.out.println("Enter Correct password");
            }
        } catch (InputMismatchException e) {
            System.out.println("Enter Atm pin only in Number");
        }



    }
}