import java.util.Scanner;

public class Backjoon_2018 {
    public static void main(String[] args) {
        // 투 포인터 연속된 자연수의 합 구하기
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int sum = 1, count = 1, start_index = 1, end_inedx = 1;

        while(end_inedx != n) {
            if(sum==n) {
                count++; end_inedx++; sum = sum + end_inedx;
            } else if (sum > n) {
                sum = sum - start_index;
                start_index++;
            } else {
                end_inedx++; sum = sum + end_inedx;
            }
        }
        System.out.println(count);
    }
}
