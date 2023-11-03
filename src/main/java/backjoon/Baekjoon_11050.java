package backjoon;

import java.util.Scanner;

public class Baekjoon_11050 {
    public static void main(String[] args) {
        // 조합 : 이항계수구하기

        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int K = scanner.nextInt();

        int D[][] = new int[N+1][N+1];

        for (int i = 0; i <= N; i++){
            D[i][i] = 1;
            D[i][1] = i;
            D[i][0] = 1;
        }

        // 점화식으로 배열 완성하기
        for (int i = 2; i <= N; i++) {
            for (int j = 1; j < i; j++) {
                D[i][j] = D[i-1][j] + D[i-1][j-1];
            }
        }

        System.out.println(D[N][K]);
    }
}
