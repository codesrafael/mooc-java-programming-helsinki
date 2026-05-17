
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String newMethod = "";

        System.out.println("Where to? ");
        int number = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= number; i++) {
            System.out.println(i);
        }
        main(newMethod);
    }

    public static void main(String everything) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Where to? ");
        int number2 = Integer.parseInt(scanner.nextLine());
        System.out.println("Where from? ");
        int number3 = Integer.parseInt(scanner.nextLine());
        for (int i = number3; i <= number2; i++) {
            System.out.println(i);

        }

    }
}
