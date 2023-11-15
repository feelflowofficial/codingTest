package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Baekjoon_18870 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder stringBuilder = new StringBuilder();

        int N = Integer.parseInt(bufferedReader.readLine());

        int A[] = new int[N];
        int B[] = new int[N];
        HashMap<Integer, Integer> rankingMap = new HashMap<Integer, Integer>();
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        for (int i = 0; i < N; i++) {
            int number = Integer.parseInt(stringTokenizer.nextToken());
            A[i] = number;
            B[i] = number;
        }

        Arrays.sort(B);

        int rank = 0;
        for (int v : B) {
            if(!rankingMap.containsKey(v)) {
                rankingMap.put(v, rank);
                rank++;
            }
        }

        for(int v : A) {
            int ranking = rankingMap.get(v);
            stringBuilder.append(ranking).append(' ');
        }
        System.out.println(stringBuilder);
    }
}
