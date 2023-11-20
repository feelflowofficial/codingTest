package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Baekjoon_24511 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder stringBuilder = new StringBuilder();
        int N = Integer.parseInt(bufferedReader.readLine());

        int[] arr = new int[N];

        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(stringTokenizer.nextToken());
        }

        Deque<Integer> deque = new LinkedList<>();
        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        for (int j = 0; j < N; j++) {
            int num = Integer.parseInt(stringTokenizer.nextToken());
            if(arr[j] == 0) {
                deque.addLast(num);
            }
        }

        int M = Integer.parseInt(bufferedReader.readLine());

        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        for (int k = 0; k < M; k++) {
            int x = Integer.parseInt(stringTokenizer.nextToken());
            deque.addFirst(x);
            stringBuilder.append(deque.pollLast()).append(" ");
        }

        System.out.println(stringBuilder);
    }
}
