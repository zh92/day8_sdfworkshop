package sg.edu.nus.iss;

import java.io.Console;
import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    
    public void example() {
        Map<String, Integer> phones = new HashMap<>();

        phones.put("Iphone", 10);
        phones.put("Huawei", 4);
        phones.put("Oppo", 6);
        phones.put("Samsung", 15);

        System.out.println("Total phone types: " + phones.size());

        for (String key: phones.keySet()) {
            System.out.println(key + " - " + phones.get(key));
        }

        String searchString = "";
        Console cons = System.console();

        while (!searchString.equals("quit")) {
            searchString = cons.readLine("Enter a string ");

            if(phones.containsKey(searchString)) {
                System.out.println(searchString + " - " + phones.get(searchString));
            } else {
                System.out.println("Item not found");
            }
        }
        //clear the data in the map
        phones.clear();
        // check size of map after clear()
        System.out.println("Total phone types: " + phones.size());
    }

}
