package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Baekjoon_10798 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        char A[][] = new char[5][15];

        String str = "";
        for(int i = 0; i < A.length; i++) {
            str = bufferedReader.readLine();
            for(int j = 0; j < str.length(); j++) {
                A[i][j] = str.charAt(j);
            }
        }

        for(int i = 0; i < 15; i++) {
            for (int j = 0; j < 5; j++) {
                if(A[j][i] == '\0') continue;
                System.out.print(A[j][i]);
            }
        }
    }
}
