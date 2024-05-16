package org.example;

public class TypeConversionTango {
    public static void main(String[] args) {
        int integerValue = 5;
        double doubleValue = 7.5;

        double integerDoubleValue = integerValue;
        int doubleIntValue = (int) doubleValue;

        System.out.println(integerDoubleValue);
        System.out.println(doubleIntValue);
    }
}
