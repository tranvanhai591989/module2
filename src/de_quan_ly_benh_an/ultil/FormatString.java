package de_quan_ly_benh_an.ultil;

import java.util.regex.Pattern;

public class FormatString {
    public static boolean formatName (String str) {
        final String VALID_FULL_NAME = "^([A-Z]{1}[a-z]{1,}\\s{1}){1,}([A-Z]{1}[a-z]{1,})$";
        Pattern pattern = Pattern.compile(VALID_FULL_NAME);
        return pattern.matcher(str).matches();
    }

    public static boolean formatAddress (String str) {
        final String VALID_ADDRESS = "^((\\d{1,})?[//]?)+((\\s)?([A-Z]{1}[a-z]{1,}))+$";
        Pattern pattern = Pattern.compile(VALID_ADDRESS);
        return pattern.matcher(str).matches();
    }

    public static boolean formatPhone (String str) {
        final String VALID_PHONE = "^([+]{1})(\\d{1,2})([0]{1}\\d{9})$";
        Pattern pattern = Pattern.compile(VALID_PHONE);
        return pattern.matcher(str).matches();
    }

    public static boolean formatEmail (String str) {
        final String VALID_EMAIL = "^(\\w+)[@]{1}(\\w+)(\\.?\\w+)+$";
        Pattern pattern = Pattern.compile(VALID_EMAIL);
        return pattern.matcher(str).matches();
    }

    public static boolean formatGender (String str) {
        final String VALID_GENDER = "^(Male|Female|Other)$";
        Pattern pattern = Pattern.compile(VALID_GENDER);
        return pattern.matcher(str).matches();
    }

    public static boolean formatDocument (String str) {
        final String VALID_DOCUMENT = "^\\d{9}$";
        Pattern pattern = Pattern.compile(VALID_DOCUMENT);
        return pattern.matcher(str).matches();
    }

    public static boolean code (String str) {
        final String VALID_CODE_EMPLOYEE = "^(EMID|CMID|BKID|CID){1}-\\d{4}$";
        Pattern pattern = Pattern.compile(VALID_CODE_EMPLOYEE);
        return pattern.matcher(str).matches();
    }

    public static boolean codeService (String str) {
        final String VALID_CODE_SERVICE = "^(SV){1}(VL|HO|RO){1}-\\d{4}$";
        Pattern pattern = Pattern.compile(VALID_CODE_SERVICE);
        return pattern.matcher(str).matches();
    }

    public static boolean dateFormat(String str) {
        final String VALID_FORMAT_DATE ="^(?:(?:31(\\/|-|\\.)(?:0?[13578]|1[02]))\\1|(?:(?:29|30)(\\/|-|\\.)(?:0?[13-9]" +
                "|1[0-2])\\2))(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$|^(?:29(\\/|-|\\.)0?2\\3(?:(?:(?:1[6-9]|[2-9]\\d)?(?:0[48]" +
                "|[2468][048]|[13579][26])|(?:(?:16|[2468][048]|[3579][26])00))))$|^(?:0?[1-9]|1\\d|2[0-8])(\\/|-|\\.)" +
                "(?:(?:0?[1-9])|(?:1[0-2]))\\4(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$";
//                "^\\d{1,2}/\\d{1,2}/\\d{4}$";
        Pattern pattern = Pattern.compile(VALID_FORMAT_DATE);
        return pattern.matcher(str).matches();
    }

    public static boolean borrowService (String str) {
        final String VALID_TYPE_SERVICE = "^(Hour|Day|Month|Year)$";
        Pattern pattern = Pattern.compile(VALID_TYPE_SERVICE);
        return pattern.matcher(str).matches();
    }

    public static boolean typeService (String str) {
        final String VALID_TYPE_SERVICE = "^(VIP|Normal|Member)$";
        Pattern pattern = Pattern.compile(VALID_TYPE_SERVICE);
        return pattern.matcher(str).matches();
    }

    public static boolean nameService (String str) {
        final String VALID_NAME_SERVICE = "^[A-Z]{1}[a-z]{1,}$";
        Pattern pattern = Pattern.compile(VALID_NAME_SERVICE);
        return pattern.matcher(str).matches();
    }
    public  static boolean dayInHospital(String str){
        final String VALID_IN_HOSPITAL="[1-31]+/+[1-12]+/+[(1|2)([0-9]{3})]";
        Pattern pattern=Pattern.compile(VALID_IN_HOSPITAL);
        return pattern.matcher(str).matches();
    }
}