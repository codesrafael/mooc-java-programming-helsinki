
import java.util.Scanner;

public class Same {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the first String: ");
        String frase1 = scan.nextLine();
        System.out.println("Enter the second String: ");
        String frase2 = scan.nextLine();
        if (frase1.equals(frase2)) {
            System.out.println("Same");
        } else {
            System.out.println("Different");
        }
    }
}
