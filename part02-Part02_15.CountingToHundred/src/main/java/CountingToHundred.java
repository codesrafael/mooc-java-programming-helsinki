
import java.util.Scanner;

public class CountingToHundred {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        int number = Integer.parseInt(scanner.nextLine());
        for (int i = number; i <= 100; i++) { /*
                                               * for 'int i' that receives
                                               * the input from the user, being this input less than one hundred, add
                                               * one
                                               */
            System.out.println(i);
        }
    }
}