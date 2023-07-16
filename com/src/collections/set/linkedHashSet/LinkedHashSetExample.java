package collections.set.linkedHashSet;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        Set<String> hash_set= new LinkedHashSet<String>();

        hash_set.add("India");
        hash_set.add("Australia");
        hash_set.add("Kenya");

        System.out.println("before removal of element: " + hash_set);

        hash_set.remove("Kenya");

        System.out.println("after removal of element: " + hash_set);

        System.out.println("Iterating over set");
        Iterator<String> i = hash_set.iterator();

        while(i.hasNext()){
            System.out.println(i.next());
        }
    }
}
