package calculator;

import calculator.domain.Calculator;
import calculator.parser.InputParser;
import calculator.validator.InputValidator;
import camp.nextstep.edu.missionutils.Console;

public class Application {
    public static void main(String[] args) {
        InputParser parser = new InputParser();
        InputValidator validator = new InputValidator();
        Calculator calculator = new Calculator();

        System.out.println("덧셈할 문자열을 입력해 주세요.");
        String input = Console.readLine();

        input = input.replace("\\n", "\n");

        int[] numbers = parser.parse(input);
        validator.validateNumbers(numbers);
        int result = calculator.add(numbers);

        System.out.println("결과 : " + result);
    }
}
