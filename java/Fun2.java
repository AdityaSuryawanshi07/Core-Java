package Function.java;

public class Fun2 {

    void info(String name, int age, float height) {
        System.out.println("Name=" + name);
        System.out.println("Age=" + age);
        System.out.println("Height=" + height);
    }

    public static void main(String[] args) {
        Fun2 obj = new Fun2();
        obj.info("Akash", 15, (float) 6.3f);
    }

}

