package helloworld;

public class IfElse {
    public static void main(String[] args) {
        boolean isAlien = false;
        if(isAlien){
            System.out.println("It is not an alien");
        }else{
            System.out.println("It is an alien");
        }

        boolean isCar = false;
        if(isCar=true){ // this value assignment return an boolean
            System.out.println("This is not supposed to happen");
        }

        boolean test = (isCar = true);
        System.out.println(test);

        // Ternary Operator ? :
        boolean wasCar = isCar ? true: false;
    }
}
