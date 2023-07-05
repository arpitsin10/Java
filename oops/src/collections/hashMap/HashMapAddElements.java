package collections.hashMap;

import java.util.HashMap;

public class HashMapAddElements {
    public static void main(String[] args) {
        HashMap<Integer, String> hm1 = new HashMap<>();
        hm1.put(1, "Geeks");
        hm1.put(2, "for");
        hm1.put(3, "Geeks");

        System.out.println(hm1);
    }
}
