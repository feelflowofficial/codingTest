package softeer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Softeer_Level3_2 {
    public static int N, M, K;
    public static int nArray[], mArray[];
    public static int check[][];

    public static int dfs(int i, int j) {
        if (i < 0 || j < 0) return 0;
        if (check[i][j] != 0) return check[i][j];
        if (nArray[i] == mArray[j]) {
            return check[i][j] = 1 + dfs(i-1, j-1);
        }
        return check[i][j];
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        N = Integer.parseInt(stringTokenizer.nextToken());
        M = Integer.parseInt(stringTokenizer.nextToken());
        K = Integer.parseInt(stringTokenizer.nextToken());

        nArray = new int[N];
        mArray = new int[M];

        check = new int[N][M];

        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        for (int i = 0; i< N; i ++) {
            nArray[i] = Integer.parseInt(stringTokenizer.nextToken());
        }

        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        for (int i = 0; i< M; i ++) {
            mArray[i] = Integer.parseInt(stringTokenizer.nextToken());
        }

        int count = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                count = Math.max(dfs(i, j), count);
            }
        }
        System.out.println(count);
    }
}
