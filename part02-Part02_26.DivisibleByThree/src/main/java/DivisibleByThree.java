
import java.util.Scanner;

public class DivisibleByThree {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        divisibleByThreeInRange(3, 6);

    }

    public static void divisibleByThreeInRange(int beginning, int end) {
        for (int i = beginning; i > 0; i++) { /*
                                               * para int i que recebe beginning,
                                               * sendo beginning maior que 0, incremente +1 a i. Se i dividido por 3 é
                                               * 0, printe i, e
                                               * se i é maior que end, saia do loop
                                               */
            if (i % 3 == 0) {
                System.out.println(i);
            } else if (i >= end && i % 3 != 0) {
                break;
            }

        }

    }
}
