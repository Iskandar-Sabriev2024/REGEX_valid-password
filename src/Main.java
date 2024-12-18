import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        
            String[] testPasswords = {
                "Abc123!@#",
                "password",
                "PASSWORD123",
                "Pass123",
                "Pass123#",
                "12345678"
        };

        for (String password : testPasswords) {
            if (isValidPassword(password)) {
                System.out.println(password + " - Parol to'g'ri");
            } else {
                System.out.println(password + " - Parol noto'g'ri");
            }
        }
    }

    public static boolean isValidPassword(String password) {
        String regex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@#$%^&+=!]).{8,}$";
        return Pattern.matches(regex, password);
    }
}

