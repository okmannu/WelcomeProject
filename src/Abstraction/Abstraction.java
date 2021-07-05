package Abstraction;


public class Abstraction {

    public static void main(String[] args) {

        // abstarct class not created object
        Bmw b = new Bmw();
        b.price = 250;
    }
}


abstract class Car {

    String brand;
    int price;

    abstract void start();

}

class Bmw extends Car {

    @Override
    void start() {
        System.out.println("start with petrol");
    }
}

class Audi extends Car {


    @Override
    void start() {
        System.out.println(" start with petrol ");
    }
}