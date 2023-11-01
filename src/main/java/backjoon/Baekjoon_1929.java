package backjoon;

import java.util.Scanner;

public class Baekjoon_1929 {
    public static void main(String[] args) {
        // 소수구하기
        Scanner scanner = new Scanner(System.in);

        int M = scanner.nextInt();
        int N = scanner.nextInt();

        int A[] = new int[N+1];

        for (int i = 1; i  <= N; i++) {
            A[i] = i;
        }

        for (int i = 2; i <=Math.sqrt(N); i++) {
            if(A[i] ==0 ) {
                continue;
            }
            // 배수 지우기 2를 제외 2+2 4부터 6 8
            for (int j = i+i; j<=N; j = j+i) {
                A[j] = 0;
            }
        }
        for (int i = M; i <= N; i++) {
            if(A[i] !=0 ) {
                System.out.println(A[i]);
            }
        }

    }
}
