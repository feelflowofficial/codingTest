package softeer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Softeer_Level2_6 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedRead = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedRead.readLine());

        int N = Integer.parseInt(stringTokenizer.nextToken());
        int M = Integer.parseInt(stringTokenizer.nextToken());

        ArrayList<int[]> arr = new ArrayList<>();
        ArrayList<int[]> arr2 = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            stringTokenizer = new StringTokenizer(bufferedRead.readLine());
            arr.add(new int[]{Integer.parseInt(stringTokenizer.nextToken()), Integer.parseInt(stringTokenizer.nextToken())});
        }

        for (int i = 0; i < M; i++) {
            stringTokenizer = new StringTokenizer(bufferedRead.readLine());
            arr2.add(new int[]{Integer.parseInt(stringTokenizer.nextToken()), Integer.parseInt(stringTokenizer.nextToken())});
        }

        int answer = 0;
        int idx = 0;
        for (int i = 0; i < N; i++) {
            int a[] = arr.get(i);
            for (int j = idx; j < M; j++){
                int b[] = arr2.get(j);

                System.out.println("a[0]" + a[0]);
                System.out.println("b[0]" + b[0]);

                if (a[0] < b[0]) {
                    b[0] -= a[0];
                    if (b[1] - a[1] > 0) answer = Math.max(answer, b[1] - a[1]);
                    System.out.println("answer1" + answer);
                    break;
                } else if (a[0] > b[0]) {
                    a[0] -= b[0];
                    if (b[1] - a[1] > 0) answer = Math.max(answer, b[1] - a[1]);
                    idx++;
                    System.out.println("answer2" + answer);
                } else {
                    if (b[1] - a[1] > 0) answer = Math.max(answer, b[1] - a[1]);
                    idx++;
                    System.out.println("answer3" + answer);
                }

            }
        }
        System.out.println(answer);
    }
}
