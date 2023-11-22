package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_2438 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder stringBuilder = new StringBuilder();
        int N = Integer.parseInt(bufferedReader.readLine());

        String str = "*";
        for (int i = 0; i < N; i++) {
            stringBuilder.append(str).append("\n");
            str += "*";
        }

        System.out.println(stringBuilder);
    }
}
