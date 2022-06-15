package ru.job4j.array;

public class LengthArrayArrays {
    public static void main(String[] args) {
        int[][] arrayNum = {{1}, {1, 2}, {1, 2, 3}};
        for (int i = 0; i < arrayNum.length; i++) {
            System.out.println("Размер вложенного  массива "  + arrayNum[i].length);
        }
    }
}
