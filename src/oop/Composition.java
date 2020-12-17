package oop;


class MotherBoard{
    private String model;
    private String manufacturer;
    private int ramSlots;
    private int cardSlots;
    private String bios;

    public void loadProgram(String programName){
        System.out.println("Program "+programName+" is now loading");
    }

    public MotherBoard(String model, String manufacturer, int ramSlots, int cardSlots, String bios) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.ramSlots = ramSlots;
        this.cardSlots = cardSlots;
        this.bios = bios;
    }
}

class Monitor{
    private String model;
    private String manufacturer;
    private int size;
    private Resolution nativeResolution;

    public Monitor(String model, String manufacturer, int size, Resolution nativeResolution){
        this.model = model;
        this.manufacturer=manufacturer;
        this.size = size;
        this.nativeResolution = nativeResolution;

    }

    public void drawPixelAt(int x,int y, String color){
        System.out.println("Drawing");
    }
}

class Case {
    private String model;
    private String manufacturer;
    private String powerSupply;
    private Dimensions dimensions;

    public Case(String model, String manufacturer, String powerSupply, Dimensions dimensions) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.powerSupply = powerSupply;
        this.dimensions = dimensions;
    }
}
class Dimensions {
    private int width;
    private int height;
    private int depth;

    public Dimensions(int width, int height, int depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }
}
class PC {
    private Case case_;
    private Monitor monitor;
    private MotherBoard motherBoard;

    public PC(Case case_, Monitor monitor, MotherBoard motherBoard) {
        this.case_ = case_;
        this.monitor = monitor;
        this.motherBoard = motherBoard;
    }

    public Monitor getMonitor() {
        return monitor;
    }
}
class Resolution{
    private int width;
    private int height;

    public Resolution(int width, int height) {
        this.width = width;
        this.height = height;
    }
}
public class Composition {
    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(1,1,1);
        Case theCase = new Case("fes","Fetge","Fesf",dimensions);
        Monitor theMonitor = new Monitor("27inch Beast","fes",28,new Resolution(1,1));
        MotherBoard theMontherboard = new MotherBoard("dw","fesf",3,4,"few");

        PC thePC = new PC(theCase, theMonitor, theMontherboard);
        thePC.getMonitor().drawPixelAt(13,123,"red");
    }


}
