package softeer;

import java.awt.event.ItemEvent;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Softeer_Level2_4 {
    public static int N;
    public static int A[][];
    public static boolean visited[][];
    public static int dx[] = {0, 1, 0, -1};
    public static int dy[] = {1, 0, -1, 0};
    public static ArrayList<Integer> list;

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        N = Integer.parseInt(stringTokenizer.nextToken());
        A = new int[N][N];
        visited = new boolean[N][N];
        list = new ArrayList<>();

        // 배열초기화
        for (int i = 0; i < N; i++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            String line = stringTokenizer.nextToken();
            for (int j = 0; j <  N; j++) {
                A[i][j] = Integer.parseInt(line.substring(j, j+1));
            }
        }

        int count = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (!visited[i][j] && A[i][j] == 1) {
                    count++;
                    BFS(i, j);
                }
            }
        }

        System.out.println(count);
        Collections.sort(list);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    public static void BFS(int i, int j) {
        Queue<int[]> queue = new LinkedList<>();
        visited[i][j] = true;
        queue.add(new int[] {i, j});

        int size = 1;
        while(!queue.isEmpty()) {
            int now[] = queue.poll();

            for (int k = 0; k < 4; k++) {
                int x = now[0] + dx[k];
                int y = now[1] + dy[k];
                if (x >= 0 && y >= 0 && x < N && y < N) {
                    if (A[x][y] != 0 && !visited[x][y]) {
                        visited[x][y] = true;
                        queue.add(new int[] {x, y});
                        size++;
                    }
                }
            }
        }
        list.add(size);
    }
}
