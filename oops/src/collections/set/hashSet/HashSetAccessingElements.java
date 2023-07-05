package collections.set.hashSet;

import java.util.HashSet;
import java.util.Set;

public class HashSetAccessingElements {

    public static void main(String[] args) {

        Set<String> hash_set = new HashSet<String>();

        hash_set.add("A");
        hash_set.add("B");
        hash_set.add("C");
        hash_set.add("D");

        System.out.println(hash_set);

        String check = "H";

        System.out.println("HashSet Contains " + check + " element: "+ hash_set.contains(check));

    }
}
