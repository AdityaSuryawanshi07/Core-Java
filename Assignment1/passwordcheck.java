package Assignment1;
import java.util.Scanner;
public class passwordcheck {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int setpassword, enterpassword;
        System.out.println("Set password:");
        setpassword = sc.next().charAt(0);

        System.out.println("Enter password:");
        enterpassword = sc.next().charAt(0);

        if (setpassword == enterpassword) {
            System.out.println("Password is correct , Lets start MCQ exam-");
        } else if (enterpassword != setpassword) {
            System.out.println("wrong password ... try 2 more time out of 2");

        } else {
            System.out.println("wrong password ... try  more 1 time out of 1");

        }


        String selectanswer;
        System.out.println("Who invented Java Programming?");

        System.out.println("1.Guido van Rossum");
        System.out.println("2.James Gosling");
        System.out.println("3.Dennis Ritchie");
        System.out.println("4.Bjarne Stroustrup");

        selectanswer = sc.next();

    }



            

    }

