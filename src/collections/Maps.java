package collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Maps {
    public static void main(String[] args) {
        Map<Integer, String> hashMap = new LinkedHashMap<Integer, String>();
        mapUtil(hashMap);
    }

    public static void mapUtil(Map<Integer, String> map) {
        map.put(101, "James, Bond");
        map.put(305, "Rick, Ross");
        map.put(404, "Not, Found");

        System.out.println("all the keys are" + map.keySet());
        System.out.println("all the key-value  pairs are" + map);

        //ITERATING THROUGH THE MAPS
        for (int key : map.keySet()) {
            System.out.println("KEY: " + key + " . VALUE: " + map.get( key));
        }
    }
}
