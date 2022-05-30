package ss19_regex_String.Exercise;

import java.util.regex.Pattern;

public class ValidatePhoneNumber {
    public static void main(String[] args) {
        String regexPhoneNumber = "^(.84)-(9|7)[0-9]{8}$";
        String testPhoneNumber = "+84-707498777";
        String testPhoneNumber1 = "+84707498777";
        String testPhoneNumber2 = "+84 0707498777";
        boolean testRegex = Pattern.matches(regexPhoneNumber,testPhoneNumber);
        System.out.println(testRegex);
        boolean testRegex1 = Pattern.matches(regexPhoneNumber,testPhoneNumber1);
        System.out.println(testRegex1);
        boolean testRegex2 = Pattern.matches(regexPhoneNumber,testPhoneNumber2);
        System.out.println(testRegex2);

    }
}
