
import java.util.Scanner;

public class NumberOfNegativeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int negativeNumbers = 0; //counter for negative numbers

        while (true){
            System.out.print("Give a number: ");
            int number = Integer.parseInt(scanner.nextLine());
            if (number < 0){
                negativeNumbers = negativeNumbers +1;
            } else if (number == 0) {
                break;
            }
        }

        System.out.println("Number of negative numbers: " + negativeNumbers);

    }
}
