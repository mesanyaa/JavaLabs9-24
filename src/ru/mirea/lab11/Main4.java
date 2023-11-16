package ru.mirea.lab11;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите год: ");
        int year = scanner.nextInt();

        System.out.print("Введите месяц (от 1 до 12): ");
        int month = scanner.nextInt() - 1;

        System.out.print("Введите число: ");
        int day = scanner.nextInt();

        System.out.print("Введите часы: ");
        int hours = scanner.nextInt();

        System.out.print("Введите минуты: ");
        int minutes = scanner.nextInt();

        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month, day, hours, minutes);

        Date date = calendar.getTime();

        System.out.println("Созданная дата и время: " + date);
    }
}
