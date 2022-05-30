package ss19_regex_String.Exercise;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ValidateClassName {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String regexValidateClassName = "^(C|P|A)[0-9]{4}(G|H|I|K|L|M)$";
        String className = "C0123A";
        String className1 = "C0123G";
        String className2 = "C0123g";
        boolean checkRegex = Pattern.matches(regexValidateClassName, className);
        System.out.println(checkRegex);
        boolean checkRegex1 = Pattern.matches(regexValidateClassName, className1);
        System.out.println(checkRegex1);
        boolean checkRegex2 = Pattern.matches(regexValidateClassName, className2);
        System.out.println(checkRegex2);
    }

}
