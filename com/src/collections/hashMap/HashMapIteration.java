package collections.hashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMapIteration {
    public static void main(String[] args) {
        HashMap<String, Integer> hm= new HashMap<>();
        hm.put("vishal", 1);
        hm.put("sachin", 2);
        hm.put("vaibhav", 3);

        for(Map.Entry<String, Integer> e: hm.entrySet()){
            System.out.println("Key: "+e.getKey() + " Value: "+e.getValue());
        }
    }
}
