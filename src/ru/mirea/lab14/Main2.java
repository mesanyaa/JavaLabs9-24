package ru.mirea.lab14;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main2 {

    public static void main(String[] args) {
        String text = "Цены: 25.98 USD, 44 RUB, 0.004 EU";

        String patternUSD = "\\b\\d+(\\.\\d+)?\\s+USD\\b";
        String patternRUB = "\\b\\d+(\\.\\d+)?\\s+RUB\\b";
        String patternEU = "\\b\\d+(\\.\\d+)?\\s+EU\\b";

        Pattern pattern = Pattern.compile(patternUSD + "|" + patternRUB + "|" + patternEU);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            String price = matcher.group().trim();
            System.out.println(price);
        }
    }
}