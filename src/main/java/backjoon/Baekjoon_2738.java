package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_2738 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        int N = Integer.parseInt(stringTokenizer.nextToken());
        int M = Integer.parseInt(stringTokenizer.nextToken());

        int A[][] = new int[N][N];
        for (int i = 0; i < A.length; i++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            for (int j = 0; j < A.length; j++) {
                A[i][j] = Integer.parseInt(stringTokenizer.nextToken());
            }
        }

        int B[][] = new int[M][M];
        for (int i = 0; i < B.length; i++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            for (int j = 0; j < B.length; j++) {
                B[i][j] = Integer.parseInt(stringTokenizer.nextToken());
            }
        }

        int C[][] = new int[N][N];
        for (int i = 0; i < C.length; i++) {
            String str = "";
            for (int j = 0; j < C.length; j++) {
                C[i][j] = A[i][j] + B[i][j];
                str += C[i][j]+" ";
            }
            System.out.println(str);
        }
    }
}
