package ru.mirea.lab13;

public class Main {
    public static void main(String[] args) {
        // разделитель - запятая
        String addressString1 = "Россия, Московская область, Москва, Ленина улица, 10, 2, 5";
        Address address1 = new Address(addressString1, ",");
        System.out.println(address1.toString());

        // разделитель - запятая
        String addressString2 = "Украина, Харьковская область, Харьков, Пушкинская улица, 15";
        Address address2 = new Address(addressString2, ",");
        System.out.println(address2.toString());

        // разделитель - точка с запятой
        String addressString3 = "США; Нью-Йорк; Нью-Йорк; Бродвей; 123; 4";
        Address address3 = new Address(addressString3, ";");
        System.out.println(address3.toString());

        // разделитель - точка с запятой
        String addressString4 = "Германия; Берлин; Берлин; Фридрихштрассе; 50; 3; 10";
        Address address4 = new Address(addressString4, ";");
        System.out.println(address4.toString());
    }
}
