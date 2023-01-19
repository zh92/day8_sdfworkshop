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

    public void example2() {
        Integer num1[] = {12, 34, 66, 43, 87, 27, 16, 7, 3, 56};
        int[] num2 = {12, 34, 66, 43, 87, 27, 16, 7, 3, 56};

        Arrays.sort(num1);
        Arrays.sort(num2);

        System.out.println("Sorted num1: " + Arrays.toString(num1));
        System.out.println("Sorted num2: " + Arrays.toString(num2));

        //sort in reverse
        Arrays.sort(num1, Collections.reverseOrder());
        //Below sort for num2 in reverse order does not work
        //Arrays.sort(num2, Collections.reverseOrder());

        System.out.println("Sorted num1: " + Arrays.toString(num1));
    }
}
