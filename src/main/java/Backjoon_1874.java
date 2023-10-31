import java.util.Scanner;
import java.util.Stack;

public class Backjoon_1874 {
    public static void main(String[] args) {
        // 스택으로 수열만들기
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        int A[] = new int[N];

        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
        }
        Stack<Integer> stack = new Stack<Integer>();
        boolean result = true;
        int num = 1;
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < A.length; i++) {
            int su = A[i];

            if (su >= A[i]) {
                while (su >= num) {
                    stack.push(num++);
                    stringBuffer.append("+\n");
                }
                stack.pop();
                stringBuffer.append("-\n");
            } else {
                int n = stack.pop();
                if (n > su) {
                    System.out.println("NO");
                    result = false;
                    break;
                } else {
                    stringBuffer.append("-\n");
                }
            }
            if (result == true) {
                System.out.println(stringBuffer.toString());
            }
        }
    }
}
