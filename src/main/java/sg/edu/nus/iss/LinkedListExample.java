package sg.edu.nus.iss;

import java.util.LinkedList;

public class LinkedListExample {

    public void example() {
        LinkedList<String> ll = new LinkedList<String>();
        ll.add("A");
        ll.add("B");
        ll.add("C");
        ll.add("D");
        ll.add("E");
        ll.add("F");
        ll.add("G");

        //Print out linkedlist
        System.out.println(ll);

        ll.remove("C");
        System.out.println(ll);

        ll.removeFirst();
        ll.removeLast();
        System.out.println(ll);

    }
}
