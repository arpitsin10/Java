package dataStructure.arrays;

public class SumOfTwoIntegers {
    public static void main(String[] args) {
        int[] arr  = new int[5];
        arr = new int[]{2, 4, 7, 9, 10};

        int length = arr.length;
        int sum =  arr[0];
        for(int i = 0; i < arr.length ; i++){
            if(i == length/2){
                sum = sum + arr[i];
                System.out.println(sum);
            }
        }



    }
}
