package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Baekjoon_2587 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int A[] = new int[5];
        int sum = 0;
        int mid = A.length/2;

        for (int i = 0; i< A.length; i++) {
            int x = Integer.parseInt(bufferedReader.readLine());
            A[i] = x;
            sum += x;
        }

        Arrays.sort(A);
        System.out.println(sum/5);
        System.out.println(A[mid]);
    }
}
