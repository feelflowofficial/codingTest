package backjoon;

import java.util.Scanner;

public class Baekjoon_11047 {
    public static void main(String[] args) {
        // 그리디 알고리즘 동전 개수의 최솟값 구하기
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        int K = scanner.nextInt();

        int A[] = new int[N];

        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
        }

        // 그리디 알고리즘 -> 최대한 큰 동전 먼저 사용하기
        int count = 0;

        for(int i = N - 1; i >= 0; i--) {
            if(A[i] <= K) {
                count += (K/A[i]);
                K = K % A[i];
            }
        }
        System.out.println(count);
    }
}
