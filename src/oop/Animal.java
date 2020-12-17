package oop;

public class Animal {
    private int brain;
    private int body;
    private int size;
    private String name;
    private int weight;

    public Animal(int brain, int body, int size, String name, int weight) {
        this.brain = brain;
        this.body = body;
        this.size = size;
        this.name = name;
        this.weight = weight;
    }
    public void eat(){
        System.out.println("Animal.eat() called");
    }
    public void move(int speed){
        System.out.println("Walk at "+speed);
    }

    public int getBrain() {
        return brain;
    }

    public int getBody() {
        return body;
    }

    public int getSize() {
        return size;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }
}
