package dataStructure.strings;

public class ValidateAnIpAddress {
    public static void main(String[] args) {
        String s = "198.01.34.10";
        boolean valid = true;
        String[] arr = s.split("\\.");
        if(arr.length!=4){
            valid = false;
        }
        else{
            for(String check: arr){
                System.out.println(check);
                if(check.charAt(0) == '0' && check.length() != 1){
                    valid = false;
                    break;
                }
                else{
                    int checkInt = Integer.parseInt(check);
                    if(checkInt < 0 || checkInt > 255) {
                        valid = false;
                    }
                }
            }
        }

        if(valid){
            System.out.println("Valid IP address");
        }
        else{
            System.out.println("Invalid IP address");
        }
    }
}

