package ExceptionHandling;

public class exceptionArray {
    public static void main(String[] args) {

        try {
            int[] data = new int[3];

            data[0] = 11;
            data[1] = 21;
            data[2] = 31;
            data[3] = 41;

            for (int i = 0; i < 3; i++) {
                System.out.println(data);

            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index out of bound");
        }
    }
}