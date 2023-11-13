package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_10811 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        int N = Integer.parseInt(stringTokenizer.nextToken());
        int M = Integer.parseInt(stringTokenizer.nextToken());

        int A[] = new int [N+1];

        for (int i = 1; i < A.length; i++) {
            A[i] = i;
        }

        for (int j = 0; j < M; j++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int F = Integer.parseInt(stringTokenizer.nextToken());
            int E = Integer.parseInt(stringTokenizer.nextToken());


            for (int x = F; x < E; x++) {
                int v = E--;
                int TEMP = A[x];
                A[x] = A[v];
                A[v] = TEMP;
            }
        }

        String str = "";
        for (int i = 1; i < N+1; i++) {
            str += A[i]+" ";
        }

        System.out.println(str);
    }
}
