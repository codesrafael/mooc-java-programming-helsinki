
import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sumOfNumbers = 0; // i create the accumulator (similar to a counter)



        while (true){
            System.out.println("Give a number: ");
            int number = Integer.parseInt(scanner.nextLine());
            if (number != 0) {
                sumOfNumbers += number; /*  the accumulator adds and stores the values given by the user
                in each loop */

            } else {
                break;
            }
        }
        System.out.println("Sum of the numbers: " + sumOfNumbers); // the accumulator prints the total of summed numbers

    }
}
