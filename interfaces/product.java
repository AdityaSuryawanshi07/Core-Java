package interfaces;

interface name {
    void getname();
}

class plates implements stdname {
    @Override
    public void getname() {
        System.out.println("samosa");
        System.out.println("Kachori");
        System.out.println("Lassi");
    }

    public static void main(String[] args) {

        plates pl= new plates();

        pl.getname();

        }
    }
