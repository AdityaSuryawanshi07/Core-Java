package Assignment1;
import java.util.Scanner;
class alphabetCheck {
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);

        char ch;
        System.out.println("Enter a letter:");
         ch = sc.next().charAt(0);
        if((ch >='a' && ch<='z') || (ch >= 'A' && ch<='Z')){
            System.out.println("Given letter is Alphabet");
        }else{
            System.out.println("Given letter is not alphabet");
        }
    }
}
