
public class FromParameterToOne {

    public static void main(String[] args) {
        printFromNumberToOne(2);

    }

    public static void printFromNumberToOne(int number) {
        
        for (int number1 = number; number >= 1; number1--) {
            if (number1 == 0) {
                break;
            }
            System.out.println(number1);
        }
    }
}