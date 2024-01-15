package softeer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Softeer_Level1_1 {
    public static void main(String[] args) throws IOException {
        // 주행거리 비교하기
        /*Scanner scanner = new Scanner(System.in);

        int a, b;

        a = scanner.nextInt();
        b = scanner.nextInt();*/

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(bufferedReader.readLine());
        bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int b = Integer.parseInt(bufferedReader.readLine());

        System.out.println(a > b ? "A"
                : a < b ? "B"
                : "same");
    }
}
