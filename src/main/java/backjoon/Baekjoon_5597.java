package backjoon;

import java.util.Scanner;

public class Baekjoon_5597 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int check[] = new int[31];
        int A[] = new int[31];
        for (int i = 1; i <= 28; i++) {
            int number = scanner.nextInt();
            check[number] = number;
        }

        for (int j = 1; j < check.length; j++) {
            if(check[j] == 0) {
                System.out.println(j);
            }
        }
    }
}
