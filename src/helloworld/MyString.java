package helloworld;

public class MyString {
    public static void main(String[] args) {
        String myString = "This is a string";
        System.out.println("myString is "+myString);
        myString = myString + ", and this is more";
        System.out.println(myString);

        String numberString = "259.55";
        numberString += "48.24";
        System.out.println(numberString);

        int someInt = 10;
        String someIntString = "20";
        System.out.println(someIntString+someIntString);
        System.out.println(someInt+ someIntString);

        // String is immutable, use StringBuffer instead


    }
}
