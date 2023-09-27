package fa.training.problem02;

public class Validator {
    public static boolean isInput(String input) {
        return input.matches("([0-9])"+("[!@#$%^&*(),.?\":{}|<>]"));
    }
}
