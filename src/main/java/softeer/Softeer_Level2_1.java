package softeer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Softeer_Level2_1 {
    public static void main(String[] args) throws IOException {
        // 금고털이
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        int W = Integer.parseInt(stringTokenizer.nextToken());
        int N = Integer.parseInt(stringTokenizer.nextToken());

        ArrayList<int[]> list = new ArrayList<>();
        for ( int i = 0; i < N; i++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            list.add(new int []{Integer.parseInt(stringTokenizer.nextToken()), Integer.parseInt(stringTokenizer.nextToken())});
        }

        Collections.sort(list, (o1, o2) -> o2[1] - o1[1]);

        int sub = W, price = 0;
        for (int[] item : list) {
            if (sub <= item[0]) {
                price += sub * item[1];
                break;
            } else {
                price += item[0] * item[1];
                sub -= item[0];
            }
        }

        System.out.println(price);
    }
}
