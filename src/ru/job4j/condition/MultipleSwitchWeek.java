package ru.job4j.condition;
/**
 * Вам на вход поступает строка. Это название дня недели. Оно может быть как на английском, так и на русском. Ваша задача - вернуть номер дня недели
 */
public class MultipleSwitchWeek {
    public int numberOfDay(String name) {
        return switch (name) {
            case "Понедельник", "Monday" -> 1;
            case "Вторник", "Tuesday" -> 2;
            case "Среда", "Wensday" -> 3;
            case "Четверг", "Thursday" -> 4;
            case "Птяница", "Friday" -> 5;
            case "Суббота", "Satturday" -> 6;
            case "Воскресенье", "Sunday" -> 7;
            default -> -1;
        };
    }
}
