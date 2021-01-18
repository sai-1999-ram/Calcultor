import java.time.LocalDate;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Scanner;
import org.apache.commons.lang.time.DateUtils;

public class App {

    private final Scanner scanner;
    private final Display display;
    private final Calculator calculator;

    public App() {
        scanner = new Scanner(System.in);
        display = new Display();
        calculator = new Calculator(scanner, display);
    }

    public void start() {
        while (true) {
            display.output("------OPTIONS-------");
            display.output("1 : ADD");
            display.output("2 : SUBSTRACT");
            display.output("3 : MULTIPLY");
            display.output("4 : DIVISION");
            display.output("5 : TO LEAVE");
            int choice = scanner.nextInt();
            if (choice == 1) {
                calculator.performAdd();
            } else if (choice == 2) {
                calculator.performSub();
            } else if (choice == 3) {
                calculator.performMultiply();
            } else if (choice == 4) {
                calculator.performDivision();
            } else {
                break;
            }
        }
    }

    public static void main(String args[]) {
        App app = new App();
        app.start();
    }
}
