
import java.util.Scanner;

public class SquareRootOfSum {

    public static void calculatingRootSquare(double number1, double number2) {
        double totalOfSum = number1 + number2;
        System.out.println(Math.sqrt(totalOfSum));

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give 2 numbers to know the square root of their sum: ");
        double number1 = Double.parseDouble(scanner.nextLine());
        double number2 = Double.parseDouble(scanner.nextLine());
        calculatingRootSquare(number1, number2);
    }
}
