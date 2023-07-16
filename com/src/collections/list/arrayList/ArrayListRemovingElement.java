package collections.list.arrayList;

import java.util.ArrayList;

public class ArrayListRemovingElement {
    public static void main(String[] args) {
        ArrayList<String> array_list = new ArrayList<String>();

        array_list.add("Geeks");
        array_list.add("for");
        array_list.add("the");
        array_list.add("Geeks");

        System.out.println("Before changing: "+array_list);

        array_list.remove(2);
        System.out.println("After changing: "+array_list);
    }
}
