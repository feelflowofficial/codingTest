package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_10870 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine());

        System.out.println(sumMethod(N));
    }

    public static int sumMethod(int N) {
        if (N == 0)	return 0;
        if (N == 1)	return 1;

        return sumMethod(N - 1) + sumMethod(N - 2);
    }
}
