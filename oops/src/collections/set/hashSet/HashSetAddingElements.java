package collections.set.hashSet;

import java.util.HashSet;
import java.util.Set;

public class HashSetAddingElements {
    public static void main(String[] args) {
        Set<String> hash_set = new HashSet<String>();

        hash_set.add("Geeks");
        hash_set.add("for");
        hash_set.add("Geeks");
        hash_set.add("Example");

        System.out.println(hash_set);

    }
}
