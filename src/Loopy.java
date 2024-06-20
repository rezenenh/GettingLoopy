public class Loopy {

    public static void main(String[] args) {

        // Part A: Counting (for) Loops

        // 1. Count up by 1 from 0 to 30
        for (int i = 0; i <= 30; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        // 2. Count down by 1 from 30 to 0
        for (int i = 30; i >= 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println();

        // 3. Count up by 3 from 0 to 18
        for (int i = 0; i <= 18; i += 3) {
            System.out.print(i + " ");
        }
        System.out.println();

        // 4. Counts down by 2 from 10 to 0
        for (int i = 10; i >= 0; i -= 2) {
            System.out.print(i + " ");
        }
        // Part B:
        // 5. Nested loop that creates the figure
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // 6. Nested loop that creates the figure
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // 7. A nested loop that creates the figure
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}