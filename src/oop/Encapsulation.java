package oop;
class Printer2 {
    private int tonerLevel = -1;
    private int pagesPrinted = 0;
    private boolean duplex;
    public Printer2(int tonerLevel, boolean duplex){
        if(tonerLevel>-1 && tonerLevel <= 100){
            this.tonerLevel = tonerLevel;
        }
        this.duplex = duplex;
    }
    public int addToner(int tonerAmount){
        if(tonerAmount>0 && tonerAmount<=100){
            int newTonerAmount = tonerAmount + tonerLevel;
            if (newTonerAmount<=100){
                tonerLevel = newTonerAmount;
                return tonerLevel;
            }
        }
        return -1;
    }

    public int printPages(int pages){
        int pagesToPrint = pages;
        if(duplex){
            pagesToPrint = pagesToPrint/2 + pagesToPrint%2;

        }
        pagesPrinted += pagesToPrint;
        return pagesToPrint;
    }
    public int getPagesPrinted(){
        return pagesPrinted;
    }

}
public class Encapsulation {
}
