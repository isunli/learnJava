package arrays;

public class Arrays {
    public static void main(String[] args) {
        int[] myVariable = new int[10];
        myVariable[5] = 50;
        int[] myIntArray = {1,2,3,4,5,6,7,8,9,10};
        double[] myDoubleArray = new double[10];
        System.out.println(myDoubleArray[1]);

        for(int i = 0; i<myVariable.length; i++){
            myVariable[i] = i*10;

        }
        System.out.println(myVariable);
    }

}
