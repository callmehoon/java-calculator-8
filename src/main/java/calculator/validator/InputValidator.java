package calculator.validator;

public class InputValidator {
    public void validateNumbers(int[] numbers) {
        for (int number : numbers) {
            if (number < 0) {
                throw new IllegalArgumentException("음수 입력은 불가합니다.: " + number);
            }
        }
    }
}
