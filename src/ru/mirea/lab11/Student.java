package ru.mirea.lab11;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Student {
    private String name;
    private double gpa;
    private Date birthDate;

    // Конструкторы, геттеры и сеттеры

    @Override
    public String toString() {
        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");
        return "Имя: " + name + ", Средний балл: " + gpa + ", Дата рождения: " + format.format(birthDate);
    }
}

