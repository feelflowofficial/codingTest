package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_25304 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int X = Integer.parseInt(bufferedReader.readLine());

        int N = Integer.parseInt(bufferedReader.readLine());
        int sum = 0;
        for (int i = 0; i < N; i++) {
            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int a = Integer.parseInt(stringTokenizer.nextToken());
            int b = Integer.parseInt(stringTokenizer.nextToken());

            sum += a*b;
        }

        if(X == sum) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
