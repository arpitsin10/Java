package collections.list.arrayList;

import java.util.ArrayList;

public class ArrayListIteration {
    public static void main(String[] args) {
        ArrayList<String> array_list = new ArrayList<String>();

        array_list.add("Geeks");
        array_list.add("for");
        array_list.add("Geeks");

        for(int i=0; i < array_list.size(); i++){
            System.out.println(array_list.get(i) + " ");
        }

        for(String str: array_list ){
            System.out.println(str + " ");
        }
    }
}
