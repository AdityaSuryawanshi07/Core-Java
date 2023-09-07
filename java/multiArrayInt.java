package array.java;

public class multiArrayInt {
    public static void main(String[] args) {

        int data[][] = new int[3][3];

        data[0][0] = 2;
        data[0][1] = 2*2;
        data[0][2] = 2*3;

        data[1][0] = 2*4;
        data[1][1] = 2*5;
        data[1][2] = 2*6;

        data[2][0] = 2*7;
        data[2][1] = 2*8;
        data[2][2] = 2*9;

    for(int i=0; i<3 ; i++){
        for (int j = 0; j < 3; j++) {
            System.out.print(""+i+""+j+"");
            break;


        }

        System.out.println(data[2][1]);
        }
    }
}
