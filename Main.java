package ivan.samoylov;


import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        IntList myList = new IntArrayList();
        for (int i = 0; i < 21 ; i++) {
            myList.add(i);
        }
        System.out.println("source list: " + myList);
        System.out.println("add() `demo: ");
        myList.add(4,134);
        System.out.println("list: " + myList);
        System.out.println("clear() `demo: ");
        myList.clear();
        System.out.println("list: " + myList);
        System.out.println("isEmpty() `demo: " + myList.isEmpty());
        for (int i = 0; i < 21 ; i++) {
            myList.add(i*i);
        }
        System.out.println("isEmpty() `demo: " + myList.isEmpty());
        System.out.println("get() `demo: " + myList.get(2) + " " + myList.get(5) + " " + myList.get(19));
        System.out.println("remove() `demo");
        myList.remove(20);
        myList.remove(0);
        myList.remove(1);
        System.out.println("list: " + myList);
        System.out.println("removeByValue() `demo");
        myList.removeByValue(100);
        System.out.println("list: " + myList);
        System.out.println("set() `demo");
        myList.set(0, 111);
        System.out.println("list: " + myList);
        System.out.println("size() demo: " + myList.size());
        System.out.println("subList() demo: " + myList.subList(3,6));
    }

}