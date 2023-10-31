
import java.util.Scanner;

public class Baekjoon_11720 {
    public static void main (String[] args){
        // 숫자합 구하기
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        String sNum = scanner.next();

        char[] cNum = sNum.toCharArray();
        int sum = 0;
        for (int i = 0; i < cNum.length; i++) {
            sum += Integer.parseInt(String.valueOf(cNum[i]));
        }
        System.out.println(sum);
    }
}
