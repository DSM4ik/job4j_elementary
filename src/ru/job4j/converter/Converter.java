package ru.job4j.converter;

/**
 * перевод рублей в валюту
 */
public class Converter {
    public static int rubleToEuro(int value) {
        return value / 70;
    }

    public static int rubleToDollar(int value) {
        return value / 60; /* формула перевода рублей в доллары. */
    }

    public static boolean testResultRubleToDollar(int in, int expected) {
        return Converter.rubleToDollar(in) == expected;
    }

    public static boolean testResultRubleToEuro(int in, int expected) {
        return Converter.rubleToDollar(in) == expected;
    }

    public static void main(String[] args) {
        int euro = Converter.rubleToEuro(140);
        System.out.println("140 rubles are " + euro + " euro.");
        int dollar = Converter.rubleToDollar(180);
        System.out.println("180 rubles are " + dollar + " dollar.");

        //тестирование
        System.out.println(testResultRubleToDollar(140, 2));
        System.out.println(testResultRubleToEuro(180, 3));
    }
}
