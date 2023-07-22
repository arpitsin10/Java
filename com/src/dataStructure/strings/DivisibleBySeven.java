package dataStructure.strings;

import java.lang.reflect.Field;

public class DivisibleBySeven {
    public static void main(String[] args){
        String s = "145";
        int remainder = 0;

        for(int i=0; i<s.length(); i++){
            remainder = remainder*10+(s.charAt(i)-'0');
        }

        if(remainder%7 == 0){
            System.out.println("Number is divisible");
        }
        else{
            System.out.println("Number is not divisible");
        }

    }
}
