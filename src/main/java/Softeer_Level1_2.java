import java.util.Scanner;

public class Softeer_Level1_2 {
    public static void main(String[] args) {
        // 근무 시간
        Scanner scanner = new Scanner(System.in);

        String startTime, endTime;
        int sum = 0;

        for (int i = 0; i < 5; i++) {
           startTime = scanner.next();
           endTime = scanner.next();

           int startHour = Integer.parseInt(startTime.substring(0,2));
           int startMin = Integer.parseInt(startTime.substring(3,5));
           int endHour = Integer.parseInt(endTime.substring(0,2));
           int endMin = Integer.parseInt(endTime.substring(3,5));
           sum += (60 - startMin) + (endHour - startHour - 1) * 60 + endMin;
        }
        System.out.println(sum);
        scanner.close();

    }
}