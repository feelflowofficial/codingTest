package softeer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Softeer_Level2_8 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        int N = Integer.parseInt(stringTokenizer.nextToken());
        int M = Integer.parseInt(stringTokenizer.nextToken());

        String[] room = new String[N];
        boolean[][] time = new boolean[N][10];
        for (int i = 0; i < N; i++) {
            room[i] = bufferedReader.readLine();
            time[i][9] = true;
        }

        Arrays.sort(room);

        for (int i = 0; i < M; i ++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int num = Arrays.asList(room).indexOf(stringTokenizer.nextToken());
            int startTime = Integer.parseInt(stringTokenizer.nextToken());
            int endTime = Integer.parseInt(stringTokenizer.nextToken());
            for (int j = startTime; j < endTime; j++) {
                time[num][j-9] = true;
            }
        }

        for (int i = 0; i < N; i++) {
            StringBuilder stringBuilder = new StringBuilder();
            System.out.printf("Room %s:\n", room[i]);
            int count =  0;
            boolean flag = true;
            for (int j = 0; j < 10; j++) {
                if (!time[i][j] && flag) {
                    if (j == 0) stringBuilder.append('0');
                    stringBuilder.append(j + 9).append('-');
                    count++;
                    flag = false;
                } else if (time[i][j]) {
                    if (!flag) stringBuilder.append(j + 9).append('\n');
                    flag = true;
                }
            }

            if (count == 0) {
                System.out.printf("Not available\n");
            } else {
                System.out.printf("%d available:\n", count);
                System.out.print(stringBuilder);
            }

            if (i != N - 1) {
                System.out.println("-----");
            }
        }
    }
}
