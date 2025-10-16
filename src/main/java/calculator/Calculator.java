package calculator;

public class Calculator {
    private String[] defaultSplitter(String input) {
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

        String[] tokens = defaultSplitter(input);
        int[] numbers = parseTokens(tokens);

        return sumTokens(numbers);
    }
}
