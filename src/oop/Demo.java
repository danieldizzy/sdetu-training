package oop;

 class Person {

    String name;
    String email;
    String phoneNumber;

    void eat() {
        System.out.println(name + " eating");
    }

    void sleep() {
        System.out.println(name + " sleeping");
    }

    void call() {
        System.out.println(name + " is calling");
    }
}


    public class Demo {

        public static void main(String[] args) {
            //We instantiate an object thus we take an object and point to a class
            Person person1 = new Person();

            //Defining some properties
            person1.name = "davidson";
            person1.email = "yahoo.com";
            person1.phoneNumber = "222333";
    //  Abstraction calling needed functions from a class
            person1.eat();
            person1.call();
            person1.sleep();

            Person person2 = new Person();
            person2.name = "chelsea";
            person2.phoneNumber = "333444";
            person2.email = "pinkpanther.com";
            person2.eat();
            person2.sleep();

            //Attributes, Variables, adjectives, descriptors
            String name = "Danie";
            String email = "wizzyworf@gmail.co";
            String phone = "123456";

            //Action, Activity, behaviour
            System.out.println(name + " sleeps");
            System.out.println(email + " address");

        }

    }
