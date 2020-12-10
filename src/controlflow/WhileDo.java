package controlflow;

public class WhileDo {
    public static void main(String[] args) {
        int count = 0;
        while(count!=5){
            System.out.println("Count value is "+count);
            count++;
        }
        for(int i = 1; i< 7;i++){
            System.out.println("Count value is "+i);
        }

        count = 0;
        while(true){
            if(count==6){
                break;

            }
            System.out.println("Count value is "+count);
            count++;
        }

        count = 1;
        do{
            System.out.println("Count value was "+count);
            count++;
        }while (count!=6);
    }
}
