
import java.util.Scanner;

public class CarryOn {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Shall we carry on? "); // I interact with the user
        String message = scanner.nextLine(); // the machine proceeds to wait for the user input

        while (true) {
            if (message.equals("no")) { // if the user inputs anything other than "no", the loop continues
                break;
            } else {
                System.out.print("Shall we carry on? ");
                message = scanner.nextLine();
            }

        }

    }
}
