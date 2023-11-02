package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Baekjoon_1920 {
    public static void main(String[] args) throws IOException {
        // 이진 탐색 원하는 정수 찾기
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        //Scanner scanner = new Scanner(System.in);

        int N = Integer.parseInt(stringTokenizer.nextToken());
        //int N = scanner.nextInt();
        int[] A = new int[N];

        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        for ( int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(stringTokenizer.nextToken());
            //A[i] = scanner.nextInt();
        }

        Arrays.sort(A);
        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int M = Integer.parseInt(stringTokenizer.nextToken());

        //int M = scanner.nextInt();

        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        for (int i = 0; i < M; i++) {
            boolean find = false;

            int target = Integer.parseInt(stringTokenizer.nextToken());
            //int target = scanner.nextInt();
            
            int start_index = 0;
            int end_index = A.length -1;
            while(start_index <= end_index) {
                int mid_index = (start_index + end_index) / 2;
                int mid_value = A[mid_index];

                if(mid_value > target) {
                    end_index = mid_index - 1;
                } else if (mid_value < target) {
                    start_index = mid_index + 1;
                } else {
                    find = true;
                    break;
                }
            }
            if(find) {
                System.out.println("1");
            } else {
                System.out.println("0");
            }
        }
    }
}
