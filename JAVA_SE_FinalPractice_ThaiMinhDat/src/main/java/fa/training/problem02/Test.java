package fa.training.problem02;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        AnalysisString analysisString = new AnalysisString();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter input");
        String input = scanner.nextLine();
        analysisString.getNumber(input);
        analysisString.getCharacter(input);

    }
}
