
import java.util.Scanner;

public class AbsoluteValue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a integer number: ");
        int number = Integer.parseInt(scanner.nextLine());

        if (number < 0) {
            System.out.print(number * -1);
        } else {
            System.out.print(number);
        }

    }
}
