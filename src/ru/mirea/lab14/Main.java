package ru.mirea.lab14;
import java.util.regex.Pattern;
public class Main {
    public static void main(String[] args) {
        String string1 = "abcdefghijklmnopqrstuv18340";
        String string2 = "abcdefghijklmnoasdfasdpqrstuv18340.";

        String pattern = "abcdefghijklmnopqrstuv18340";

        boolean isMatch1 = Pattern.matches(pattern, string1);
        boolean isMatch2 = Pattern.matches(pattern, string2);

        System.out.println(isMatch1); // true
        System.out.println(isMatch2); // false
    }
}
