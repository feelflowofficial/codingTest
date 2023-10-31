package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Baekjoon_2178 {
    // 상하좌우 대각선 움직일수 있다는 문제가 나오면
    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};
    static boolean[][] visited;
    static int[][] A;
    static int N, M;

    public static void main(String[] args) throws IOException {
        // 미로탐색 BFS
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        N = Integer.parseInt(stringTokenizer.nextToken());
        M = Integer.parseInt(stringTokenizer.nextToken());
        A = new int[N][M];
        visited = new boolean[N][M];

        for (int i = 0; i<N; i++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            String line = stringTokenizer.nextToken();
            for (int j = 0; j < M; j++) {
                A[i][j] = Integer.parseInt(line.substring(j, j+1));
            }
        }
        BFS(0, 0);
        System.out.println(A[N-1][M-1]);
    }

    private static void BFS(int i, int j) {
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[] {i, j});
        visited[i][j] = true;
        while(!queue.isEmpty()) {
            int now[] = queue.poll();
            for (int k = 0; k < 4; k++) { // 상하좌우탐색
                int x = now[0] + dx[k];
                int y = now[1] + dy[k];
                if (x >= 0 && y >= 0 && x < N && y < M) { // 배열을 넘어가면 안되고
                    if(A[x][y] != 0 && !visited[x][y]) { // 0이여서 갈수없거나 기방문한 곳이면 안됨
                        // 이제 갈수 있는 곳이다.
                        visited[x][y] = true;
                        A[x][y] = A[now[0]][now[1]] + 1; //핵심
                        queue.add(new int[] {x, y});
                    }
                }
            }
        }
    }
}
