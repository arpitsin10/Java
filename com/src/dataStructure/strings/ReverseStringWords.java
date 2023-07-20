package dataStructure.strings;

public class ReverseStringWords {
    public static void main(String[] args) {
        String s = "hello.how.are.you";
        String arr[] = s.split("\\.");
        String reverse = "";
        for(int i=arr.length-1; i>0; i--){
            reverse += arr[i] + ".";
        }
        reverse += arr[0];
        System.out.println(reverse);
    }
}
