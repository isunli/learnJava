package oop;

public class Dog extends Animal {
    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;
    public Dog(int size, String name, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        super(1, 1, size, name, weight);
        this.coat = coat;
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
    }
    private void chew() {
        System.out.println("Dog.chew() called");
    }
    @Override
    public void eat(){
        System.out.println("Dog.eat() called");
        chew();
        super.eat();
    }

    public void run(){
        System.out.println("Dog.run() called");
        move(2);
    }

    public void walk(){
        System.out.println("Dog.walk() called");
        move(1);
    }

    private void moveLegs(int speed){
        System.out.println("Dog.moveLegs() called");
    }
    @Override
    public void move(int speed){
        System.out.println("Dog.move() called");
        moveLegs(speed);
        super.move(speed);
    }

}
