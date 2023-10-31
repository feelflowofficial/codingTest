package backjoon;

import java.util.Scanner;

public class Baekjoon_11659 {
    public static void main(String[] args) {
        // 구간합 구하기
        Scanner scanner = new Scanner(System.in);

        int suNo = scanner.nextInt();
        int quizNo = scanner.nextInt();
        int[] haparray = new int[suNo + 1];
        for (int i = 1; i <= suNo; i++) {
            haparray[i] = haparray[i - 1] + scanner.nextInt();
        }

        for (int j = 0; j < quizNo; j++) {
            int value1 = scanner.nextInt();
            int value2 = scanner.nextInt();
            System.out.println(haparray[value2] - haparray[value1-1]);
        }
    }
}
