
import java.util.Scanner;

public class NumberOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0; /*I want to count the number of attempts/inputs, so
        i need to create a variable before the loop(or else i can't) in order to use it during the loop and after */

        while (true) {
            System.out.println("Give a number: ");
            int number = Integer.parseInt(scanner.nextLine());
            if (number != 0) {
                count = count + 1;
            } else {
                break;
            }
        }
        System.out.println("Number of numbers: " + count); /* this variable only works
        because it was created before the loop */

    }
}
