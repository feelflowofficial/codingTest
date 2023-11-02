package backjoon;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Baekjoon_2252 {
    public static void main(String[] args) {
        // 위상 정렬 줄세우기
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int M = scanner.nextInt();
        ArrayList<ArrayList<Integer>> A = new ArrayList<>();

        for (int i = 0; i <= N; i++) {
            A.add(new ArrayList<>());
        }
        int indegree[] = new int[N+1];
        for (int i = 0; i < M; i ++) {
            int S = scanner.nextInt();
            int E = scanner.nextInt();
            A.get(S).add(E);
            indegree[E]++; // 진입차수 배열 데이터 저장 부분
        }

        // 위상정렬 실행
        Queue<Integer> queue = new LinkedList<>();
        for ( int i = 1 ; i<= N; i++) {
            if(indegree[i] ==0) {
                queue.offer(i);
            }
        }

        while(!queue.isEmpty()) {
            int now = queue.poll();
            System.out.println(now+ " ");
            for (int next : A.get(now)) {
                indegree[next]--;
                if (indegree[next] == 0 ) {
                    queue.offer(next);
                }
            }
        }
    }
}
