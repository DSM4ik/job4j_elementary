package ru.job4j.array;

/**
 * В этом задании нужно написать программу, которая сравнивает последние элементы массивов
 */
public class EqLast {
    public static boolean check(int[] left, int[] right) {
        boolean result = true;
        if (left[left.length - 1] != right[right.length - 1]) {
            result = false;
        }
        return result;
    }
}
