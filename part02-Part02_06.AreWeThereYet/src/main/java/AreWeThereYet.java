
import java.util.Scanner;

public class AreWeThereYet {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Give a number: ");
        int number = Integer.parseInt(scanner.nextLine()); // waiting for the user to give a number
        while (true) { // while it is true that the number is different from 4, it will ask the user to give a number
            if (number != 4) {
                System.out.print("Give a number: ");
                number = Integer.parseInt(scanner.nextLine());
            } else { // if the number is 4, the program will end
                break;
            }
        }
    }
}
