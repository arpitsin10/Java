package collections.set.hashSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetIteratingSet {
    public static void main(String[] args) {
        Set<String> hash_set = new HashSet<String>();

        hash_set.add("A");
        hash_set.add("B");
        hash_set.add("C");
        hash_set.add("D");

        for(String str: hash_set){
            System.out.println("Value: "+ str);
        }

        Iterator<String> i = hash_set.iterator();

        while(i.hasNext()){
            System.out.println(i.next());
        }
    }
}
