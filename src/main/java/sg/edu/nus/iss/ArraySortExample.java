package sg.edu.nus.iss;

import java.util.Arrays;
import java.util.Collections;

public class ArraySortExample {
    public void example() {
        String name[] = {"david", "harry", "redcliff", "bob", "chris", "tom", "benson", "nick"};

        System.out.println("Unsorted array: " + Arrays.toString(name));

        Arrays.sort(name);
        System.out.println("Sorted array: " + Arrays.toString(name));

        //Sort array in descending order
        Arrays.sort(name, Collections.reverseOrder());
        System.out.println("Sorted array in reverse: " + Arrays.toString(name));
    }
}
