package helloworld;

public class Helloworld {
    public static void main(String[] args) {
        System.out.println("Hello world");
        int myFirstNumber = 5;
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Maximum Value = "+myMaxIntValue);
        System.out.println("Integer Minimum Value = "+myMinIntValue);
        System.out.println(myFirstNumber);

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Maximum Value = "+myMaxByteValue);
        System.out.println("Byte Minimum Value = "+myMinByteValue);

        short myMaxShortValue = Short.MAX_VALUE;
        short myMinShortValue = Short.MIN_VALUE;
        System.out.println("Max Short Value "+myMaxShortValue);
        System.out.println("Min Short Value "+myMinShortValue);


        long myLongValue = 100; //64 bit
        long myMaxLongValue = Long.MAX_VALUE;
        long myMinLongValue = Long.MIN_VALUE;
        System.out.println("Max Long Value "+myMaxLongValue);
        System.out.println("Min Long Value "+myMinLongValue);
        long myLongValue2 = Integer.MAX_VALUE + 1L;
        System.out.println(myLongValue2);

        int myTotal = (myMinIntValue / 2);
        byte myNewByteValue = (byte) (myMinByteValue/2);
        short myNewShortValue = (short)(myMinShortValue / 2);
    }

}
