package softeer;

import java.util.Scanner;

public class Softeer_Level1_1 {
    public static void main(String[] args) {
        // 주행거리 비교하기
        Scanner scanner = new Scanner(System.in);

        int a, b;

        a = scanner.nextInt();
        b = scanner.nextInt();

        System.out.println(a > b ? "A"
                : a < b ? "B"
                : "same");
    }
}
