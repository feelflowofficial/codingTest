package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Baekjoon_28279 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder stringBuilder = new StringBuilder();
        int N = Integer.parseInt(bufferedReader.readLine());

        Deque<Integer> queue = new LinkedList<>();

        StringTokenizer stringTokenizer;
        for (int i = 0; i < N; i++) {
            String str = bufferedReader.readLine();

            if (str.indexOf("1") > -1) {
                String[] s = str.split(" ");

                queue.addFirst(Integer.parseInt(s[1]));
            } else if (str.indexOf("2") > -1) {
                String[] s = str.split(" ");

                queue.addLast(Integer.parseInt(s[1]));
            } else if (str.equals("3")) {
                if (queue.isEmpty()) {
                    stringBuilder.append("-1").append('\n');
                } else {
                    stringBuilder.append(queue.peekFirst()).append('\n');
                    queue.pollFirst();
                }
            } else if (str.equals("4")) {
                if (queue.isEmpty()) {
                    stringBuilder.append("-1").append('\n');
                } else {
                    stringBuilder.append(queue.peekLast()).append('\n');
                    queue.pollLast();
                }
            } else if (str.equals("5")) {
                stringBuilder.append(queue.size()).append('\n');
            } else if (str.equals("6")) {
                if(queue.isEmpty()) {
                    stringBuilder.append("1").append('\n');
                } else {
                    stringBuilder.append("0").append('\n');
                }
            } else if (str.equals("7")) {
                if(queue.isEmpty()) {
                    stringBuilder.append("-1").append('\n');
                } else {
                    stringBuilder.append(queue.peekFirst()).append('\n');
                }
            } else if (str.equals("8")) {
                if(queue.isEmpty()) {
                    stringBuilder.append("-1").append('\n');
                } else {
                    stringBuilder.append(queue.peekLast()).append('\n');
                }
            }
        }

        System.out.print(stringBuilder);
    }
}
