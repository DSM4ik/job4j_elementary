package ru.job4j.array;

public class Matrix {
    public static int[][] multiple(int size) {
        int[][] tablePow = new int[size][size];
        for (int i = 0; i < tablePow.length; i++) {
            for (int j = 0; j < tablePow[i].length; j++) {
                tablePow[i][j] = (i + 1) * (j + 1);
            }
        }
        return tablePow;
    }
}
