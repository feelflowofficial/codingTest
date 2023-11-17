package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;

public class Baekjoon_18258 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder stringBuilder = new StringBuilder();

        int N = Integer.parseInt(bufferedReader.readLine());
        Deque<Integer> queue = new LinkedList<>();
        String str = "";

        for (int i = 0;  i < N; i++ ){
            str = bufferedReader.readLine();

            if(str.indexOf("push") > -1) {
                String[] s = str.split(" ");
                queue.add(Integer.parseInt(s[1]));
            } else if (str.equals("pop")) {
                if (queue.isEmpty()) {
                    stringBuilder.append("-1").append('\n');
                } else {
                    stringBuilder.append(queue.peek()).append('\n');
                    queue.poll();
                }
            } else if (str.equals("size")) {
                stringBuilder.append(queue.size()).append('\n');
            } else if (str.equals("empty")) {
                if(queue.isEmpty()) {
                    stringBuilder.append("1").append('\n');
                } else {
                    stringBuilder.append("0").append('\n');
                }
            } else if (str.equals("front")) {
                if(queue.isEmpty()) {
                    stringBuilder.append("-1").append('\n');
                } else {
                    stringBuilder.append(queue.peek()).append('\n');
                }
            } else if (str.equals("back")) {
                if(queue.isEmpty()) {
                    stringBuilder.append("-1").append('\n');
                } else {
                    stringBuilder.append(queue.peekLast()).append('\n');
                }
            }
        }

        System.out.println(stringBuilder);
    }
}
