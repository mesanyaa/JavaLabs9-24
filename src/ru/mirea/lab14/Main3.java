package ru.mirea.lab14;
import java.util.regex.Pattern;

public class Main3 {

    public static void main(String[] args) {
        String[] dates = {"29/02/2000", "30/04/2003", "29/02/2001", "30-04-2003", "1/1/1899"};

        String regex = "^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/((19|2[0-9])[0-9]{2}|9999)$";
        Pattern pattern = Pattern.compile(regex);

        for (String date : dates) {
            boolean isMatch = pattern.matcher(date).matches();
            System.out.println(date + ": " + isMatch);
        }
    }
}
