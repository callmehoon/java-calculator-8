package calculator;

public class Calculator {
    private int sumTokens(String[] tokens) {
        int sum = 0;

        for (String token : tokens) {
            sum += Integer.parseInt(token);
        }

        return sum;
    }

    public int calculate(String input) {
        if (input == null || input.isEmpty()) {
            return 0;
        }

        String[] tokens = input.split("[,:]");

        return sumTokens(tokens);
    }
}
