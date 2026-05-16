
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double total = 0;
        double quantity = 0;
        while (true) {
            System.out.println("Give a number: ");
            double number = Double.parseDouble(scanner.nextLine());
            if (number > 0) {
                total += number;
                quantity = quantity + 1;

            } else if (number == 0) {
                break;
            }


        }
        if (quantity == 0) {
            System.out.println("Cannot calculate the average");
        } else {
            System.out.println(total / quantity);

        }

    }
}

     