package Assignment1;
import java.util.Scanner;
class ovel_or_not {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char alphabet;
        System.out.println("Enter Alphabet:");
        alphabet = sc.next().charAt(0);
        if(alphabet=='a' ||alphabet == 'e'||alphabet=='i' ||alphabet== 'o' ||alphabet== 'u'){
            System.out.println("it is an vovel");
        }else{
            System.out.println("It is an conconant");
        }
    }
}
