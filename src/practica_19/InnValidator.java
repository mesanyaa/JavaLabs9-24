package practica_19;

public class InnValidator {
    public static boolean validateInn(String inn) throws InvalidInnException {
        if (inn == null || inn.length() != 12) {
            throw new InvalidInnException("Недействительный ИНН: неверная длина");
        }

        char[] innChars = inn.toCharArray();
        int[] coefficients = {7, 2, 4, 10, 3, 5, 9, 4, 6, 8};

        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += (innChars[i] - '0') * coefficients[i];
        }

        int controlDigit = sum % 11;
        if (controlDigit == 10) {
            controlDigit = 0;
        }

        if (controlDigit != (innChars[11] - '0')) {
            throw new InvalidInnException("Недействительный ИНН: неверная контрольная цифра");
        }

        return true;
    }
    public static void main(String[] args) {
        try {
            String userInn = "771237370181";

            validateInn(userInn);
            System.out.println("ИНН действителен.");
        } catch (InvalidInnException e) {
            System.out.println("ИНН недействителен: " + e.getMessage());
        }
    }
}
