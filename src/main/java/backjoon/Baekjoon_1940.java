package backjoon;

import java.util.Arrays;
import java.util.Scanner;

public class Baekjoon_1940 {
    public static void main(String[] args) {
        // 투 포인터 정렬에서 양끝에서 오게
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int value = scanner.nextInt();
        int[] array = new int[N];
        int count = 0, start_index = 0;

        for (int i =0; i < N; i++) {
            array[i] = scanner.nextInt();
        }

        int end_index = array.length-1;

        Arrays.sort(array);
        while(start_index < end_index) {
            if (array[start_index] + array[end_index] < value) {
                start_index++;
            } else if (array[start_index] + array[end_index] < value) {
                end_index--;
            } else {
                count++; start_index++; end_index--;
            }
        }

        System.out.println(count);
    }
}
