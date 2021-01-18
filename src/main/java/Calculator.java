import java.util.Scanner;

public class Calculator {

    private final Scanner scanner;
    private final Display display;

    public Calculator(Scanner scanner, Display display) {
        this.scanner = scanner;
        this.display = display;
    }

    public void performAdd(){
        display.output("Please enter value 1:");
        double a = scanner.nextDouble();
        display.output("Please enter value 2:");
        double b = scanner.nextDouble();
        display.output(String.format("Value : %s", (a + b)));
    }

    public void performSub(){
        display.output("Please enter value 1:");
        double a = scanner.nextDouble();
        display.output("Please enter value 2:");
        double b = scanner.nextDouble();
        display.output(String.format("Value : %s", (a - b)));
    }

    public void performMultiply(){
        display.output("Please enter value 1:");
        double a = scanner.nextDouble();
        display.output("Please enter value 2:");
        double b = scanner.nextDouble();
        display.output(String.format("PRODUCT : %s", (a * b)));
    }

    public void performDivision(){
        display.output("Please enter  dividend:");
        double a = scanner.nextDouble();
        display.output("Please enter value divisor:");
        double b = scanner.nextDouble();
        display.output(String.format("Value : %s", (a / b)));
    }
}
