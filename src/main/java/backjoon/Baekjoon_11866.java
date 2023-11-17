package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Baekjoon_11866 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        StringBuilder stringBuilder = new StringBuilder();
        int N = Integer.parseInt(stringTokenizer.nextToken());
        int k = Integer.parseInt(stringTokenizer.nextToken());

        Queue<Integer> queue = new LinkedList<>();

        for(int i = 1; i <= N; i++) {
            queue.add(i);
        }

        int i = 1;
        while(queue.size() >= 1){
            if (queue.size() <= 2) {
                if (queue.size() > 1) {
                    stringBuilder.append(queue.peek()).append(", ");
                    queue.poll();
                } else {
                    stringBuilder.append(queue.peek());
                    queue.poll();
                }
            } else {
                if (i % k == 0) {
                    stringBuilder.append(queue.peek()).append(", ");
                    queue.poll();
                } else {
                    queue.add(queue.poll());
                }
            }
            i++;
        }
        System.out.println("<"+ stringBuilder +">");
    }
}
