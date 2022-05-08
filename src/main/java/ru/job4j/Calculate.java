package ru.job4j;

/**
 * В определении типа данных есть характеристика, указывающая, какие данные могут быть записаны в эту переменную.
 *
 * byte – числа от -128 до 127.
 *
 * short – числа от -32,768 до 32,767
 *
 * int – числа от - 2 в степени 31 до 2 в степени 31 минус 1.
 *
 * long – числа от - 2 в степени 63 до 2 в степени 63 минус 1.
 *
 * float – числа с плавающей точкой. Диапазон допустимых значений находится в пределах от 1.4e-45f до 3.4e+38f.
 *
 * double – числа с плавающей точкой. Диапазон допустимых значений находится в пределах от 4.9e-324 до 1.7e+308.
 *
 * boolean – true или false.
 *
 * char – Любой символ. Символ в Java описывается одинарными кавычками.
 */
public class Calculate {
    public static void main(String[] args) {
        byte mem = 1;
        System.out.println(mem);
        short size = 1;
        System.out.println(size);
        int length = 100500;
        System.out.println(length);
        long money = 900500;
        System.out.println(money);
        float weight = 1.05F;
        System.out.println(weight);
        double distance = 100500.99;
        System.out.println(distance);
        boolean exists = true;
        System.out.println(exists);
        char gender = 'Y';
        System.out.println(gender);
    }
}
