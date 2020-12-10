package controlflow;

public class Switch {
    public static void main(String[] args) {
        int value = 1;
        if (value == 1) {
            System.out.println("value is 1");
        } else if (value == 2) {
            System.out.println("value is 2");
        }

        int switchValue = 3;
        switch (switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("was a 3, or a 4, or a 5");
            default:
                System.out.println("Other value");
        }
    }
}
