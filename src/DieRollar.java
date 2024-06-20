import java.util.Random;
import java.util.Scanner;

public class DieRollar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean continueRoll = true;
        while (continueRoll) {
            int throwsCount = 0;
            int die1, die2, die3;

            System.out.printf("%-10s %-10s %-10s %-10s %-10s\n", "Throw#", "Die1", "Die2", "Die3", "Sum");

            do {
                throwsCount++;
                die1 = random.nextInt(6) + 1;
                die2 = random.nextInt(6) + 1;
                die3 = random.nextInt(6) + 1;
                int sum = die1 + die2 + die3;

                System.out.printf("%-10d %-10d %-10d %-10d %-10d\n", throwsCount, die1, die2, die3, sum);

            } while (die1 != die2 || die1 != die3);

            System.out.println("Triple achieved :)");

            System.out.print("Roll again? (Y/N): ");
            String response = scanner.nextLine();
            if (!response.equalsIgnoreCase("y")) {
                continueRoll = false;
            }
        }

        scanner.close();
    }
}
