package com.elabor8.numberconverter;

class NumberConverter {

    private NumberConverter() {}

    private static String[] unitStrings = {
            "",
            "one",
            "two"
    };

    static String convert(int numberToConvert) {

        if (numberToConvert == 0) return "zero";

        return unitStrings[numberToConvert];
    }

}
