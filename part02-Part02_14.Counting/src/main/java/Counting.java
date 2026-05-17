
import java.util.Scanner;

public class Counting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        int number = Integer.parseInt(scanner.nextLine()); 
        for (int i = 0; i <= number; i++) { /* for an integer 'i' that receives 0,
        being 'i' less than the input by the user, add one*/
            System.out.println(i); // do print the output
        }

    }
}
