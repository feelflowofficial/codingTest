package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Baekjoon_1707 {
    static ArrayList<Integer>[] A;
    static int[] check;
    static boolean[] visited;
    static boolean IsEven;

    public static void main(String[] args) throws IOException {
        // 그래프 표현 이분 그래프 판별하기
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int testCase = Integer.parseInt(bufferedReader.readLine());

        for (int t = 0; t < testCase; t++) { // 주어진 테스트 케이스만큼 돌림
            String[] s = bufferedReader.readLine().split(" ");
            int V = Integer.parseInt(s[0]);
            int E = Integer.parseInt(s[1]);

            A = new ArrayList[V+1];
            visited = new boolean[V+1];
            check = new int[V+1];
            IsEven = true;

            for (int i = 1; i <=V; i++) {
                A[i] = new ArrayList<Integer>();
            }

            //에지 데이터 저장하기
            for (int i = 0; i < E; i++) {
                s = bufferedReader.readLine().split(" ");
                int start = Integer.parseInt(s[0]);
                int end = Integer.parseInt(s[1]);
                A[start].add(end);
                A[end].add(start);
            }

            // 모든 노드에서 DFS 실행 해야함
            for (int i = 1; i <= V; i++) {
                if(IsEven) {
                    DFS(1);
                } else {
                    break;
                }
            }

            if(IsEven) System.out.println("YES");
            else System.out.println("NO");
        }
    }

    private static void DFS(int start) {
        visited[start] = true;
        for (int i : A[start]) { // 인접리스트로 받아서 start에서 연결된 모든 노드를 탐색
            if (!visited[i]) {
                // 그 직전에 있는 노드와 다른 집합으로 분류를 해주는 것이 필요
                check[i] = (check[start] + 1)  % 2;
                DFS(i);
            } else {
                if(check[start] == check[i]) {
                    IsEven = false;
                }
            }
        }
    }
}
