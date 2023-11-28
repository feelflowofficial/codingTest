package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_25501 {
    static int count = 1;
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder stringBuilder = new StringBuilder();
        int T = Integer.parseInt(bufferedReader.readLine());


        for (int i = 0; i < T; i++) {
            count = 1;
            stringBuilder.append(isPalindrome(bufferedReader.readLine()) +" " + count).append("\n");
        }

        System.out.println(stringBuilder);
    }

    public static int recursion(String s, int l, int r){
        if(l >= r) {
            return 1;
        }
        else if(s.charAt(l) != s.charAt(r)) {
            return 0;
        }
        else {
            count++;
            return recursion(s, l+1, r-1);
        }
    }

    public static int isPalindrome(String s){
        return recursion(s, 0, s.length()-1);
    }
}
