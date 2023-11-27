package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_27433 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine());

        long sum = factorial(N);
        System.out.println(sum);
    }

    public static long factorial(int N) {
        if (N <= 1) return 1;
        return N * factorial(N - 1);
    }
}
