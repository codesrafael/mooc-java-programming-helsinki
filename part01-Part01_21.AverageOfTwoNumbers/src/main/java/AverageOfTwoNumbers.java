
import java.util.Scanner;

public class AverageOfTwoNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first number: ");
        int firstNumber = Integer.parseInt(scanner.nextLine());
        System.out.println("Give the second number: ");
        int secondNumber = Integer.parseInt(scanner.nextLine());
        double result = (firstNumber + secondNumber)/2.0; /*the parentheses are needed so 
        the machine understands that everything is to be divided by 2, and not only one variable */
        System.out.println("The average is " + result);



    }
}
