package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Baekjoon_28278 {
    public static void main(String[] args) throws IOException{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder stringBuilder = new StringBuilder();
        Stack<Integer> stack = new Stack<>();
        int N = Integer.parseInt(bufferedReader.readLine());

        for (int i = 0; i < N; i++) {
            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            String command = stringTokenizer.nextToken();

            if(command.equals("1")) {
                stack.push(Integer.parseInt(stringTokenizer.nextToken()));
            } else if(command.equals("2")) {
                if(!stack.isEmpty()) {
                    stringBuilder.append(stack.lastElement()).append("\n");
                    stack.pop();
                } else {
                    stringBuilder.append(-1).append("\n");
                }
            } else if(command.equals("3")) {
                stringBuilder.append(stack.size()).append("\n");
            } else if(command.equals("4")) {
                if(stack.isEmpty()) {
                    stringBuilder.append(1).append("\n");
                } else {
                    stringBuilder.append(0).append("\n");
                }
            } else if(command.equals("5")) {
                if(stack.isEmpty()) {
                    stringBuilder.append(-1).append("\n");
                } else {
                    stringBuilder.append(stack.lastElement()).append("\n");
                }
            }
        }

        bufferedReader.close();
        System.out.println(stringBuilder);
    }
}
