package collections.set.hashSet;

import java.util.HashSet;
import java.util.Set;

public class HashSetDeletingElements {
    public static void main(String[] args) {
        Set<String> hash_set = new HashSet<String>();

        hash_set.add("A");
        hash_set.add("B");
        hash_set.add("C");
        hash_set.add("D");

        System.out.println("Before removing element: " +hash_set);

        hash_set.remove("C");

        System.out.println("After removing element: " + hash_set);
    }
}
