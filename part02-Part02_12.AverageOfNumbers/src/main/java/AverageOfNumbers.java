
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double total = 0;
        double quantity = 0;
        
        while (true){
            System.out.println("Give a number: ");
            double number = Double.parseDouble(scanner.nextLine());
            if (number != 0){
                total += number;
                quantity = quantity +1;
            } else {
                break;
            } 
        } double average = total/quantity;
        System.out.println("Average of the numbers: " + average );

    }
}
