package oop;

class Dog2 {
    private static String name;
    public Dog2(String name){
        Dog2.name = name;
    }
    public void printName(){
        System.out.println("name= "+name);
    }
}
public class StaticVariable {
    public static void main(String[] args) {
        Dog2 rex = new Dog2("rex");
        Dog2 fluffy = new Dog2("fluffy");
        rex.printName();
        fluffy.printName();
    }
}
