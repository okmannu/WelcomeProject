import encapsulation.Encapsulation;

public class ClassTest {

    public static void main(String[] agrs) {
 /*       Person p = new Person();
        p.age = 50;
        p.name = "Manish";
        p.run();
        p.walk();

        Person p1 = new Person(33, "yash");


        // contructor call
        System.out.println(Person.count);

        System.out.println(p.name + " " + p.age);
        System.out.println(p1.name + " " + p1.age);*/


        Developer d = new Developer(24, "Rohit");
        d.walk();


    }
}

// Developer class
// inheritance  with extends

class Developer extends Person {

    public Developer(int age, String name) {

        super(age, name);

    }   // runtime polymorphis walk() both class in present that's y
        void walk(){
            System.out.println(name + "Developer is  Working");


    }
}



//person class

class Person {
    //propertice , it's not take run time memmory  like remote
    int age;
    String name;

    static int count;


    // creating constructor
    public Person() {
        count++;
        System.out.println("creatin a object = " + count);
    }


    //overload constructor
    public Person(int age, String name) {

        this.name = name;
        this.age = age;
    }


// methad and fuction both are same

    void run() {
        System.out.println(name + "i'm runing ");
    }

    // polymorphism
    void walk() {
        System.out.println(name + "i'm walking ");
    }

    //  argument passing and compile time polymorphis
    void walk(int steps) {
        System.out.println(name + "walk" + steps);
    }


    void dowork() {
        System.out.println("inheritance");
    }

}