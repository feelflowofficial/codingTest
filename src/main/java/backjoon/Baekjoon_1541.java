package backjoon;

import java.util.Scanner;

public class Baekjoon_1541 {
    static int answer = 0;
    public static void main(String[] args) {
        // 최솟값을 만드는 괄호 배치 찾기
        Scanner scanner = new Scanner(System.in);

        String example = scanner.nextLine();
        String str[] = example.split("-");

        for (int i = 0; i < str.length; i++) {
            int temp = mySum(str[i]);
            if (i ==0) {
                answer = answer + temp;
            } else {
                answer = answer - temp;
            }
        }
        System.out.println(answer);
    }

    private static int mySum(String s) {
        int sum = 0;
        String[] temp = s.split("[+]");
        for (int i = 0; i < temp.length; i++) {
            sum = sum + Integer.parseInt(temp[i]);
        }
        return sum;
    }
}
