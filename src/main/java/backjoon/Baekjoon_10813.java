package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_10813 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        int N = Integer.parseInt(stringTokenizer.nextToken());
        int M = Integer.parseInt(stringTokenizer.nextToken());

        int A[] = new int[N + 1];

        for(int x = 1; x < A.length; x ++) {
            A[x] = x;
        }

        for (int i = 0 ; i < M; i++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int F = Integer.parseInt(stringTokenizer.nextToken());
            int E = Integer.parseInt(stringTokenizer.nextToken());
            int tmp = A[F];
            A[F] = A[E];
            A[E] = tmp;
        }

        String str = "";
        for (int j = 1; j < A.length; j++) {
            str += A[j]+ " ";
        }
        System.out.println(str);
    }
}
