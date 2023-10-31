import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Backjoon_11286 {
    public static void main(String[] args) throws IOException {
        // 스택 큐 절댓값 힙 구현하기 우선순위큐

        BufferedReader bufferderReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferderReader.readLine());

        int N = Integer.parseInt(stringTokenizer.nextToken());

        PriorityQueue<Integer> myQueue = new PriorityQueue<>((o1, o2) -> {
            // 절댓값 작은 데이터 우선
            // 절댓값이 같은 경우 음수 우선
            int frist_abs = Math.abs(o1);
            int second_abs = Math.abs(o2);
            if(frist_abs == second_abs) {
                return o1 > o2 ? 1 : -1;
            }
            return frist_abs - second_abs;
        });

        for (int i = 0; i < N; i++) {
            stringTokenizer = new StringTokenizer(bufferderReader.readLine());
            int request = Integer.parseInt(stringTokenizer.nextToken());
            if (request == 0) {
                if (myQueue.isEmpty()) {
                    System.out.println("0");
                } else {
                    System.out.println(myQueue.poll());
                }
            } else {
                myQueue.add(request);
            }

        }

    }
}
