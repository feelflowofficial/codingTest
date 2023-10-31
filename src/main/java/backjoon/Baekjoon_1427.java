package backjoon;

import java.util.Scanner;

public class Baekjoon_1427 {
    public static void main(String[] args) {
        // 선택정렬 내림차순으로 자릿수 정리하기
        Scanner scanner = new Scanner(System.in);

        String str = scanner.next();
        int A[] = new int[str.length()];

        for (int i = 0; i < str.length(); i++) {
            A[i] = Integer.parseInt(str.substring(i, i+1));
        }

        //선택정렬
        for ( int i = 0; i < str.length(); i++) {
            int max = i;
            for ( int j = i + 1; j < str.length(); j++) {
                if (A[j] > A[max]) {
                    max = j;
                }
            }
            if (A[i] < A[max]) {
                int temp = A[i];
                A[i] = A[max];
                A[max] = temp;
            }
        }

        for ( int i = 0; i < str.length(); i++) {
            System.out.print(A[i]);
        }
    }
}
