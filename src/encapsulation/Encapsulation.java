package encapsulation;

public class Encapsulation {

    public static void main(String[] args) {



        Laptop l1 = new Laptop();
        l1.setPrice(30);

        System.out.println(l1.setPrice(20));
    }


}


class Laptop {
    int ram;
    private int price;

// it used onther packed in main class using object creating


    public boolean setPrice(int price) {
        //is ths user an admin;
        boolean isAdmin = true;
        if (!isAdmin) {
            System.out.println("you connat set prices");

        } else {
            this.price = price;
        }
        return true;
    }

    public void doWork() {
        System.out.println("Working working");
    }

}








