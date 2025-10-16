package calculator.parser;

import java.util.regex.Pattern;

public class InputParser {
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
            try {
                numbers[i] = Integer.parseInt(tokens[i]);
            } catch (NumberFormatException e) {
                throw new IllegalArgumentException("숫자가 아닌 문자가 포함되어 있습니다.: " + tokens[i]);
            }
        }

        return numbers;
    }

    public int[] parse(String input) {
        if (input == null || input.isEmpty()) {
            return new int[0];
        }

        String[] tokens = splitInput(input);
        return parseTokens(tokens);
    }
}
