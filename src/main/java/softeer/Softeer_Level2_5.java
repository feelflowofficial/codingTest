package softeer;

import java.util.Scanner;

public class Softeer_Level2_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        int j = 2;
        // 2 3 5 9 17 33

        int count = 0;

        // 2 * 2,  3 * 3, 5 * 5, 9 * 9
        for (int i = 0; i < N; i++) {
            j = j + j -1;
            count = j * j;
        }
        System.out.println(count);
    }
}
