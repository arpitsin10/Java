package dataStructure.strings;

public class LargestWordInDictionary {
    public static void main(String[] args) {
        String[] arr = {"ale", "apple", "aa", "plea"};

        String largest_word= arr[0];
        int length = arr[0].length();
        for(String check : arr){
            if(largest_word.equals(check)){
                continue;
            }
            else{
                if(check.length() > length){
                    largest_word = check;
                    length = check.length();
                }
            }
        }

        System.out.println("Largest Word: "+largest_word+" Length: "+length);
    }
}
