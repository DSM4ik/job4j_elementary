package ru.job4j.array;

/**
 * Обход массива с последнего элемента
 * внутри цикла нужно добавить проверку, чтобы в консоль выводились элементы только с четными индексами.
 */
public class ReverseLoopForArray {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7};
        for (int i = 0; i < numbers.length; i++) {
            if (i % 2 == 0) {
                System.out.println(" " + numbers[numbers.length - 1 - i]);
            }

        }
    }
}
