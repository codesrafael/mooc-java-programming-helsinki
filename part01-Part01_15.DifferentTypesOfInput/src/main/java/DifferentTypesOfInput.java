
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Give a string: ");
        String message = scan.nextLine();
        System.out.println("Give an integer: ");
        int number = Integer.parseInt(scan.nextLine());
        System.out.println("Give a double: ");
        double number2 = Double.parseDouble(scan.nextLine());
        System.out.println("Give a boolean: ");
        Boolean bool = Boolean.parseBoolean(scan.nextLine());
        System.out.println("You gave the string " + message);
        System.out.println("You gave the integer " + number);
        System.out.println("You gave the double " + number2);
        System.out.println("You gave the boolean " + bool);


    }
}
