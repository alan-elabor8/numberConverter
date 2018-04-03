package com.elabor8.numberconverter;

public class NumberConverter {

    private static String[] unitStrings = {"zero", "one"};

    public static String convert(int numberToConvert) {
        return unitStrings[numberToConvert];
    }
}
