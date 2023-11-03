package backjoon;

import java.util.Scanner;

public class Baekjoon_11726 {
    public static void main(String[] args) {
        // DP 2*N 타일 채우기

        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        long D[] = new long[1001];
        D[1] = 1; // N = 1 일때 타일 채우는 경우의 수
        D[2] = 2; // N = 2 일때 타일 채우는 경우의 수

        for (int i = 3; i <= N; i++) {
            D[i] = (D[i -1] + D[i-2]) % 10007;
        }
        System.out.println(D[N]);
    }
}
