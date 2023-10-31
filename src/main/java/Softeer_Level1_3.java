import java.util.Scanner;

public class Softeer_Level1_3 {
    public static void main(String args[]) {
        // A + B
        Scanner scanner = new Scanner(System.in);

        int count, a, b;

        count  = scanner.nextInt();

        for (int i = 0; i < count; i++) {
            a = scanner.nextInt();
            b = scanner.nextInt();

            System.out.println("Case #" + (i + 1) + ": " + (a+b));
        }
        scanner.close();
    }
}
