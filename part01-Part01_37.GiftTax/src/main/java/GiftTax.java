
import java.util.Scanner;

public class GiftTax {

    public static void taxingGifts(int gift) {
        int taxLowerLimit1 = 100;
        int taxLowerLimit2 = 1700;
        int taxLowerLimit3 = 4700;
        int taxLowerLimit4 = 22100;
        int taxLowerLimit5 = 142100;
        double taxrate1 = 0.08;
        double taxrate2 = 0.10;
        double taxrate3 = 0.12;
        double taxrate4 = 0.15;
        double taxrate5 = 0.17;

        if (gift >= 5000 && gift <= 25000) {
            System.out.println(taxLowerLimit1 + (gift -5000) * taxrate1);
        } else if ( gift >= 25000 && gift <= 55000) {
            System.out.println(taxLowerLimit2 + (gift - 25000) * taxrate2);
        } else if ( gift >= 55000 && gift <= 200000) {
            System.out.println(taxLowerLimit3 + (gift - 55000) * taxrate3);
        } else if (gift >= 200000 && gift <= 1000000) {
            System.out.println(taxLowerLimit4 + (gift - 200000) * taxrate4);
        } else if ( gift > 1000000) {
            System.out.println((taxLowerLimit5) + (gift - 1000000) * taxrate5);
        } else {
            System.out.println("No tax! ");
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Value of the gift? ");
        int gift = Integer.parseInt(scanner.nextLine());
        taxingGifts(gift);

    }
}