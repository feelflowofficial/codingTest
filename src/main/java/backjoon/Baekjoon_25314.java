package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_25314 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder stringBuilder = new StringBuilder();
        int N = Integer.parseInt(bufferedReader.readLine());

        int count = N /4 ;

        for (int i = 0; i < count; i++) {
            stringBuilder.append("long").append(" ");
        }
        stringBuilder.append("int");

        System.out.print(stringBuilder);
    }
}
