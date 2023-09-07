package array.java;

public class MULTIarray {
    public static void main(String[] args) {

        String data[][] = new String[3][3];

        data[0][0]="Mumbai";
        data[1][0]="Pune";
        data[2][0]="Hydrabad";

        data[0][1]="Hydrabad";
        data[1][1]="Hydrabad";
        data[2][1]="Hydrabad";

        data[0][2]="Hydrabad";
        data[1][2]="Hydrabad";
        data[2][2]="Hydrabad";

        for(int i=0; i<3;i++){
            for(int j=0;j<3;j++){

                System.out.print(i+""+j+"");
            }
            System.out.println();
        }


    }
}
