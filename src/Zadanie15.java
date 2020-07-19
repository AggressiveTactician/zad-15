import java.util.Scanner;

public class Zadanie15 {
    private Scanner scanner = new Scanner(System.in);

    public Number[] getNumbers() {
        Number[] numbers = new Number[10];
        for (int i = 0; i < 10; i++) {
            System.out.println("Podaj 10 liczb: ");
            int value = scanner.nextInt();
            boolean find = false;
            for (Number number : numbers) {
                if (number != null && number.getValue() == value) {
                    number.setContent(number.getValue() + 1);
                    find = true;
                }
            }
            if (!find) {
                numbers[i] = new Number(value, 1);
            }
        }
        return numbers;
    }

    public void printNumbers(Number[] numbers) {
        for (Number number : numbers) {
            if (number != null && number.getContent() > 1) {
                System.out.println(number.getValue());
            }
        }
    }
}