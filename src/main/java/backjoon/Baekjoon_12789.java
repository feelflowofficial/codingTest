package backjoon;

import java.io.*;
import java.util.*;

public class Baekjoon_12789 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine());

        int line[] = new int[N];

        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        for (int i = 0; i < N; i++) {
            line[i] = Integer.parseInt(stringTokenizer.nextToken());
        }

        System.out.println(solution(line));
    }

    public static String solution(int[] A) {
        int start = 1;
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < A.length; i++) {
            if (A[i] == start) {
                start++;
            } else {
                if (!stack.isEmpty() && stack.peek() == start) {
                    stack.pop();
                    i--;
                    start++;
                } else {
                    stack.push(A[i]);
                }
            }
        }

        boolean result = true;

        for (int i = 0; i < stack.size(); i++) {
            if(stack.pop() == start) {
                start++;
            } else {
                result = false;
                break;
            }
        }
        return result ? "Nice" : "Sad";
    }
}
