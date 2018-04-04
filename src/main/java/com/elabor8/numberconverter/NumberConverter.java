package com.elabor8.numberconverter;

class NumberConverter {

    private NumberConverter() {}

    private static String[] unitStrings = {
            "",
            "one",
            "two"
    };

    static String convert(int numberToConvert) {

        if (isZero(numberToConvert)) return "zero";

        return unitStrings[numberToConvert];
    }

    private static boolean isZero(int numberToConvert) {
        return numberToConvert==0;
    }
}
