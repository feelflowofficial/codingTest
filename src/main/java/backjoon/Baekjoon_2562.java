package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_2562 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int A[] = new int[10];
        int count = 0;
        int max = 0;
        for (int i = 1; i < 10; i++) {
            A[i] = Integer.parseInt(bufferedReader.readLine());
        }

        for(int j = 1; j < A.length; j++) {
            if(max < A[j]) {
                count = j;
                max = A[j];
            }
        }

        System.out.println(max);
        System.out.println(count);
    }
}
