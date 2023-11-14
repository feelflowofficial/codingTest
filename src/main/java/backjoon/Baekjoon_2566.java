package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_2566 {
    public static void main(String[] args) throws IOException {
        int A[][] = new int[10][10];

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int max = 0;
        int vi = 0;
        int vj = 0;
        for (int i = 1; i < A.length; i++) {
            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            for (int j = 1; j < A.length; j++) {
                A[i][j] = Integer.parseInt(stringTokenizer.nextToken());

                if(max < A[i][j]) {
                    max = A[i][j];
                    vi = i;
                    vj = j;
                }
            }
        }
        System.out.println(max);
        System.out.println(vi+" "+ vj);
    }
}
