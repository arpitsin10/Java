package collections.hashMap;

import java.util.HashMap;

public class HashMapRemoveElement {
    public static void main(String[] args) {
        HashMap<Integer, String> hm = new HashMap<>();

        hm.put(1, "Geeks");
        hm.put(2, "for");
        hm.put(3, "Geeks");

        System.out.println("Initial Map: "+ hm);

        hm.remove(2);
        System.out.println("Changed Map: "+ hm);
    }
}
