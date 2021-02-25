package ru.job4j.loop;

/**
 * В этом задании нужно посчитать количество простых чисел от 1 до finish
 */
public class PrimeNumber {
    public static int calc(int finish) {
        int count = 0;
        for (int number = 2; number <= finish; number++) {
            if (CheckPrimeNumber.check(number)) {
                count++;
            }
        }
        return count;
    }
}
