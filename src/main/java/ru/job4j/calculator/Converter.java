package ru.job4j.calculator;

public class Converter {
    public static float rubleToEuro(float value) {
        return value / 70;

    }

    public static float rubleToDollar(float value) {
        return value / 60; /* формула перевода рублей в доллары. */

    }

    public static boolean testResultRubleToDollar(int in, int expected) {
        return Converter.rubleToDollar(in) == expected;
    }

    public static boolean testResultRubleToEuro(int in, int expected) {
        return Converter.rubleToEuro(in) == expected;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(140);
        float dollar = Converter.rubleToDollar(200);
        System.out.println("140 rubles are " + euro + " euro.");
        System.out.println("200 rubles are " + dollar + " euro.");

        //тестирование
        System.out.println(testResultRubleToDollar(120, 3));
        System.out.println(testResultRubleToEuro(140, 2));

    }
}
