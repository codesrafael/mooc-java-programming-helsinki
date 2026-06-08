
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sumOfnumbers = 0;
        int numberOfnumbers = 0;
        int even = 0;
        int odd = 0;

        System.out.println("Give numbers:");
        while (true) {
            int input = Integer.parseInt(scanner.nextLine());
            if (input == -1) {
                System.out.println("Thx! Bye!");
                break;
            } else if (input % 2 == 0) {
                sumOfnumbers += input;
                numberOfnumbers++;
                even++;
            } else if (input % 2 != 0) {
                sumOfnumbers += input;
                numberOfnumbers++;
                odd++;

            }

        }
        System.out.println("Sum: " + sumOfnumbers);
        System.out.println("Numbers: " + numberOfnumbers);
        System.out.println("Average: " + (double) sumOfnumbers / numberOfnumbers);
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);

    }

}
