package helloworld;

public class FloatAndDouble {
    public static void main(String[] args) {
        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;

        System.out.println("Float minimum Value = "+myMinFloatValue);
        System.out.println("Float maximum Vlaue = " + myMaxFloatValue);
        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double minimum Value "+myMinDoubleValue);
        System.out.println("Double maximum value "+myMaxDoubleValue);

        // decimal number are assumed as double in Java
        float myFloat = (float)4.14;
    }
}
