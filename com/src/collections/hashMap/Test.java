package collections.hashMap;

import java.util.HashMap;

public class Test {
    public static void main(String[] args) {
        String arpit =  new String("Sinha");
        arpit.hashCode();
        HashMap<String, String> hashmap1= new HashMap<>();
        hashmap1.put("Sinha", "OK");
        System.out.println(arpit.hashCode());
    }
}
