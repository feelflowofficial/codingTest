import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Baekjoon_1546 {
    public static void main (String[] args) {
        // 평균 구하기
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        Integer[] jumsu = new Integer[n];

        for (int i = 0; i < n; i++) {
            jumsu[i] = scanner.nextInt();
        }
        long sum = 0;
        long max = 0;
        Arrays.sort(jumsu, Collections.reverseOrder());
        max = jumsu[0];

        for(int j = 0; j < jumsu.length; j++) {
            sum += jumsu[j];
        }

        System.out.println(sum * 100.0 / max / n);

    }
}
