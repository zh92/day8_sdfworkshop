package sg.edu.nus.iss;

import java.util.Iterator;
import java.util.Stack;

public class StackExample {
    public void example() {

        Stack<Integer> stack = new Stack<Integer>();

        for (int i=0; i<10; i++) {
            stack.push(i);
        }
        
        for (int i=0; i<5; i++) {
            Integer stackItem = stack.pop();
            System.out.println("Stack item (pop) " + stackItem);

            //See what is the last item in the stack
            Integer item = stack.peek();
            System.out.println("Item on top of stack: " + item);
        }

        Integer firstItem = stack.firstElement();
        System.out.println("First element on stack: " + firstItem);
        
        Integer lastItem = stack.lastElement();
        System.out.println("Last element on stack: " + lastItem);

        Integer indexElement = stack.search(3);
        System.out.println("Stack element found at index: " + indexElement);

        Iterator<Integer> iter = stack.iterator();
        while(iter.hasNext()) {
            Integer stackIt = iter.next();
            System.out.println("Iterator stack item: " + stackIt);
        } 

    }
}
