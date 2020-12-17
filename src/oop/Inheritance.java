package oop;

public class Inheritance {
    public static void main(String[] args) {
        Animal animal = new Animal(1, 1, 5,"Animal",5);
        Dog dog = new Dog(1,"Yourkie",1,1,1,1,1,"FE");
        dog.eat();
        dog.walk();
        dog.run();
    }

}
