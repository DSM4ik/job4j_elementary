package ru.job4j.condition;

/**
 * В этом задании нужно проверить, что треугольник может существовать.
 */
public class Triangle {
    public static boolean exist(double ab, double ac, double bc) {
        return ((ab + ac) > bc) && ((ac + bc) > ab) && ((ab + bc) > ac);
    }
}
