package com.elabor8.numberconverter;

public class NumberConverter {

    private NumberConverter() {}

    private static String[] unitStrings = {
            "zero",
            "one",
            "two"
    };

    public static String convert(int numberToConvert) {
        return unitStrings[numberToConvert];
    }

    public static void brokenCode() {
        String couldBeNull = "Hello";
        System.out.println(couldBeNull.length());
    }
}
