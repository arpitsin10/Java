package collections.hashMap;

import java.util.HashMap;

public class HashMapChangeElement {
    public static void main(String[] args) {
        HashMap<Integer, String> hm = new HashMap<>();

        hm.put(1, "Geeks");
        hm.put(2, "Geeks");
        hm.put(3, "Geeks");

        System.out.println("Initial Map: "+ hm);

        hm.put(2, "for");
        System.out.println("Changed Map: "+ hm);
    }
}
