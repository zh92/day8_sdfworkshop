package sg.edu.nus.iss;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionSortExample {
    
    public void example() {
        List<Integer> numbers = new ArrayList<Integer>();
        
        for (int i=0; i<10; i++) {
            numbers.add((int)(Math.random() * 100));
        }
        System.out.println("Unsorted list: " + numbers);

        //Sort list
        Collections.sort(numbers);
        System.out.println("Sorted list: " + numbers);

        //Sort in descending
        Collections.sort(numbers, Collections.reverseOrder());
        System.out.println("Sorted list in descending: " + numbers);
        //Alternative
        numbers.sort(Comparator.reverseOrder());
    }

    public void example2() {
        Employee emp1 = new Employee("123", "David Ng", "ISS", "lecturer", "david@gmail.com", 3000);
        Employee emp2 = new Employee("124", "Richard Ng", "Engineering", "researcher", "richard@gmail.com", 6000);
        Employee emp3 = new Employee("125", "Benson Chan", "Business", "lecturer", "benson@gmail.com", 4000);

        List<Employee> employees = new ArrayList<Employee>();
        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);

        System.out.println("Employees before sorting: " + employees);

        //Do an ascending sort using collection
        Collections.sort(employees);
        System.out.println("Employees after sorting: " + employees);

        //Sorting using Comparator and lambda
        employees.sort(Comparator.comparing(e -> e.getSalary()));
        System.out.println("Employees sorted by salary: " + employees);

    }
}
