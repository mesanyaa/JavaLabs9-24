package ru.mirea.lab11;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Date currentDate = new Date();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите дату и время в формате ГГГГ-ММ-ДД ЧЧ:ММ: ");
        String inputDateTime = scanner.nextLine();

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        try {
            Date userDateTime = dateFormat.parse(inputDateTime);

            if (userDateTime.compareTo(currentDate) > 0) {
                System.out.println("Введенная дата и время больше текущей даты и времени");
            } else if (userDateTime.compareTo(currentDate) < 0) {
                System.out.println("Введенная дата и время меньше текущей даты и времени");
            } else {
                System.out.println("Введенная дата и время равны текущей дате и времени");
            }
        } catch (ParseException e) {
            System.out.println("Неправильный формат даты и времени");
        }
    }
}