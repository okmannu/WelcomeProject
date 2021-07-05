package com.company;

import encapsulation.Encapsulation;

public class Main {

    public static void main(String[] args) {

        // write your code here and creating object and acces

  Person P = new Person();
        P.Name = "Manish Dhote";
        P.Age = 22;

        Person P1 = new Person();
        P1.Name = "Rahul Dhote";
        P1.Age = 23;

        Person P2 = new Person(26 , "Karuna");


       // System.out.println(P.Name + P.Age);
       // System.out.println(P1.Name + P1.Age);

        P.walk();
        P.walk(5);
        P1.eat();
        P2.read();

        // count the creating constructor
        System.out.println(Person.count);

        // child class object
        Developer d = new Developer(24,"Mannu");
        d.walk();




    }
}


class Developer extends Person{

    public Developer(int Age, String Name) {

        super(Age, Name);
    }
        void walk() {
            System.out.println(Name + "Developer is walking");
        }


}
class Person {
    protected String Name;
    int Age;

    static int count;

    public Person(){
        count++;
        System.out.println("Creating an object");
    }

    public Person(int Age, String Name) {
                 this();
                this.Name = Name;
                this.Age =  Age;

        System.out.println("Creating an object");
    }

    void walk() {
        System.out.println(Name + " is walking ");
    }

    void walk(int steps) {
        System.out.println(Name + " is walking " + steps);
    }

    void eat() {
        System.out.println(Name + "is eating");
    }

    void read(){
        System.out.println(Name + "is reading book");
    }
}




