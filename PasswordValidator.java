package com.timurradko.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordValidator implements Validator<String> {
    private final static String REGEX = "[^;:'\".,$%#№@ ]*";

    @Override
    public boolean valid(String password){
        if (password.length() > 4) {
            Pattern pattern = Pattern.compile(REGEX);
            Matcher matcher = pattern.matcher(password);
            return matcher.matches();
        } else {
            System.out.print("The password is too short. ");
            return false;
        }
    }

    public static void main(String[] args) {
        Validator<String> validator = new PasswordValidator();
        String s1 = "45";
        String s2 = "$eytrwert";
        String s3 = "dsgas%fbdh";
        String s4 = " hshga ";
        String s5 = "dssfjs-dvskh";
        String s6 = "kghsfdgf.adfsd";
        String s7 = "dhjgfsdjk";
        String s8 = "djaksgdf89";
        String s9 = "88djaksgdf";
        boolean validator1 = validator.valid(s1);
        boolean validator2 = validator.valid(s2);
        boolean validator3 = validator.valid(s3);
        boolean validator4 = validator.valid(s4);
        boolean validator5 = validator.valid(s5);
        boolean validator6 = validator.valid(s6);
        boolean validator7 = validator.valid(s7);
        boolean validator8 = validator.valid(s8);
        boolean validator9 = validator.valid(s9);
        System.out.println("s1: " + validator1);
        System.out.println("s2: " + validator2);
        System.out.println("s3: " + validator3);
        System.out.println("s4: " + validator4);
        System.out.println("s5: " + validator5);
        System.out.println("s6: " + validator6);
        System.out.println("s7: " + validator7);
        System.out.println("s8: " + validator8);
        System.out.println("s9: " + validator9);
    }
}
