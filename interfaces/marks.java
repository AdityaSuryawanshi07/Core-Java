package interfaces;

interface rollno{
    void getrollno();
        }
public class marks implements rollno {
    @Override
    public void getrollno() {
        System.out.println(12);
    }

    public static void main(String[] args) {


        marks m = new marks();

        m.getrollno();
    }


}
