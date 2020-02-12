package com.timurradko.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DateValidator implements Validator<String> {
    private final static String REGEX = "(0[1-9]|[1-2][0-9]|3[0-1])[.](0[1-9]|1[1-2])[.][0-9]{1,4}";

    @Override
    public boolean valid(String date) {
        if (date.length() > 6 && date.length() < 11) {
            Pattern pattern = Pattern.compile(REGEX);
            Matcher matcher = pattern.matcher(date);
            boolean match = matcher.matches();
            return match;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Validator<String> validator = new DateValidator();
        String s1 = "1.20.2000";
        String s2 = "02.00.2000";
        String s3 = "12.12.2020";
        String s4 = "12.13.2000";
        String s5 = "12.12.20002";
        String s6 = "12.12.200";
        boolean valid = validator.valid(s1);
        boolean valid1 = validator.valid(s2);
        boolean valid2 = validator.valid(s3);
        boolean valid3 = validator.valid(s4);
        boolean valid4 = validator.valid(s5);
        boolean valid5 = validator.valid(s6);
        System.out.println(valid);
        System.out.println(valid1);
        System.out.println(valid2);
        System.out.println(valid3);
        System.out.println(valid4);
        System.out.println(valid5);
    }
}
