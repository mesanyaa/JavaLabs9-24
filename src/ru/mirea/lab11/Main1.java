package ru.mirea.lab11;
import java.util.Date;

public class Main1 {
    public static void main(String[] args) {
        String developerSurname = "Иванов";
        Date startDate = new Date();
        Date endDate = new Date();

        System.out.println("Фамилия разработчика: " + developerSurname);
        System.out.println("Дата получения задания: " + startDate);
        System.out.println("Дата сдачи задания: " + endDate);
    }
}
