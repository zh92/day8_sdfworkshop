package sg.edu.nus.iss;

import java.util.Enumeration;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapExample {
    public void example(){
        Map<String, Integer> laptops = new ConcurrentHashMap<>();
        laptops.put("Acer", 10);
        laptops.put("Apple", 30);
        laptops.put("Razer", 16);
        laptops.put("Samsung", 7);

        //Get total size of the map object
        System.out.println("Total laptops: " + laptops.size());

        //Iterate through the map
        for (String key : laptops.keySet()) {
            System.out.println(key + " - " + laptops.get(key));
        }

        String searchString = "ASUS";
        if (laptops.containsKey(searchString)) {
            System.out.println(searchString + " - " + laptops.get(searchString));
        }

        Enumeration<Integer> enums = ((ConcurrentHashMap<String, Integer>)laptops).elements();
        while(enums.hasMoreElements()) {
            System.out.println(enums.nextElement());
        }

        Integer retValue = laptops.putIfAbsent("Apple", 10);
        if(retValue != null) {
            System.out.println("Item found: " + retValue);
        }

        searchString = "Apple";
        if (laptops.containsKey(searchString)) {
            System.out.println(searchString + " - " + laptops.get(searchString));
        }

        retValue = laptops.putIfAbsent("Microsoft", 5);

        for (String key : laptops.keySet()) {
            System.out.println(key + " - " + laptops.get(key));
        }

    }
}
