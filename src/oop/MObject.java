package oop;

public class MObject {
    public static void main(String[] args) {
        Car porsche = new Car();
        Car holden = new Car(4,4);
        porsche.setModel("Carrera");
        System.out.println(porsche.getModel());
    }
}
