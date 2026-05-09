
import java.util.Scanner;

public class SpeedingTicket {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String speedTicket = "Speeding ticket!";
       System.out.println("Give speed: ");
       int speed = Integer.parseInt(scanner.nextLine());
       if (speed > 120) {
           System.out.println(speedTicket);
       }

       
    }
}
