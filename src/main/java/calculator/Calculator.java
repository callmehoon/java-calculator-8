package calculator;

import java.util.regex.Pattern;

public class Calculator {
    private String[] splitInput(String input) {
        if (input.startsWith("//")) {
            int delimiterEndIndex = input.indexOf("\n");
            String customDelimiter = input.substring(2, delimiterEndIndex);
            String numbers = input.substring(delimiterEndIndex + 1);

            return numbers.split(Pattern.quote(customDelimiter));
        }

        return input.split("[,:]");
    }

    private int[] parseTokens(String[] tokens) {
        int[] numbers = new int[tokens.length];

        for (int i = 0; i < tokens.length; i++) {
            numbers[i] = Integer.parseInt(tokens[i]);
        }

        return numbers;
    }

    private int sumTokens(int[] numbers) {
        int sum = 0;

        for (int number : numbers) {
            sum += number;
        }

        return sum;
    }

    public int calculate(String input) {
        if (input == null || input.isEmpty()) {
            return 0;
        }

        String[] tokens = splitInput(input);
        int[] numbers = parseTokens(tokens);

        return sumTokens(numbers);
    }
}
