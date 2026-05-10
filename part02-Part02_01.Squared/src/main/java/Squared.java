
import java.util.Scanner;

public class Squared {

    public static void calculatingSquare(int number) { //I create a method responsible for calculating the square
        int square = number * number;
        System.out.println(square);

    }

    public static void main(String[] args) { // on the main method, I let it resposible for getting the input
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a number to know its square: ");
        int number = Integer.parseInt(scanner.nextLine());
        calculatingSquare(number);
    }
}
