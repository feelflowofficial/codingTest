import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Backjoon_2164 {
    public static void main(String[] args) {
        // 스택 큐 카드게임
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        Queue<Integer> myQueue = new LinkedList<>();

        for ( int i = 1; i <= N; i++) {
            myQueue.add(i);
        }

        while(myQueue.size() > 1) {
            myQueue.poll();
            myQueue.add(myQueue.poll());
        }
        System.out.println(myQueue.peek());
    }
}
