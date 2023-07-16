package dataStructure.strings;

import java.util.Scanner;

public class CheckStringEqual {

    public void checkStringEqual(String str, String str1){
        if(str.length() ==  str1.length()){
            boolean flag = false;
            for(int i=0; i< str.length(); i++){
                if(str.charAt(i) != str1.charAt(i)){
                    flag = true;
                    System.out.println("Strings are not equal");
                    break;
                }
            }
            if (!flag){
                System.out.println("Strings are equal");
            }
        }
        else{
            System.out.println("Strings are not equal");
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter first String: ");
        String str = scn.next();
        System.out.println("Enter second String: ");
        String str1 = scn.next();

       str1 = str1.toLowerCase();
       str = str.toLowerCase();

        CheckStringEqual obj = new CheckStringEqual();
        obj.checkStringEqual(str,str1);

    }
}
