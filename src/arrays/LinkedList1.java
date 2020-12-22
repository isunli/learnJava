package arrays;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

class Obj{}
public class LinkedList1 {


    public static void main(String[] args) {
        ArrayList<Integer> intList = new ArrayList<Integer>();
        intList.add(1);
        intList.add(2);
        System.out.println(intList.toString());
        intList.add(1,3); //O(n) to add or remove element
        System.out.println(intList.toString());

        LinkedList<String> placesToVisit =  new LinkedList<>();
        placesToVisit.add("a");
        placesToVisit.add("b");
        System.out.println(placesToVisit.toString());
        Iterator<String> i = placesToVisit.iterator();
        while(i.hasNext()){
            System.out.println("Now visiting "+i.next());
        }
        System.out.println("============================");
    }

}
