
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sumOfNumbers = 0; // the accumulator
        int counter = 0; // the counter



        while (true){
            System.out.println("Give a number: ");
            int number = Integer.parseInt(scanner.nextLine());
            if (number != 0) {
                sumOfNumbers += number;
                counter = counter + 1;

            } else {
                break;
            }
        }
        System.out.println("Number of numbers: " + counter);
        System.out.println("Sum of the numbers: " + sumOfNumbers);

    }
}
