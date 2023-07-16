package dataStructure.strings;

import java.util.Scanner;

public class CreateEqualStrings {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter first String: ");
        String str = scn.next();
        System.out.println("Enter second String: ");
        String str1 = scn.next();

        if(str.length() == str1.length()){
            for(int i = 0; i < str.length(); i++){
                if(str.charAt(i) != str1.charAt(i)){
                    str1 = str1.replace(str1.charAt(i), str.charAt(i));
                }
            }
            System.out.println(str1);
        }
        else{
            System.out.println("Strings not equal in length");
        }
    }
}
