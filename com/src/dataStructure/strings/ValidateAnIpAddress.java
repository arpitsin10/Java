//package dataStructure.strings;
//
//public class ValidateAnIpAddress {
//    public static void main(String[] args) {
//        String s = "198.01.34.10";
//
//        String arr[] = s.split("\\.");
//        boolean flag = true;
//        if (arr.length != 4) {
//            System.out.println("In-Valid IP address");
//            System.out.println("u are in if");
//        } else {
//            for (int i = 0; i < arr.length; i++) {
//                int c = Integer.parseInt(arr[i]);
//                System.out.println("c:" + c);
//                if (c < 0 || c > 255 || (c=0 &&  > 1)) {
//                    flag =false;
//                    break;
//                }
//            }
//        }
//        if(flag) {
//            System.out.println("Valid IP address");
//        }
//        else{
//            System.out.println("In valid IP address");
//        }
//    }
//}
//
