import java.util.Scanner;

public class Backjoon_2750 {
    public static void main(String[] args) {
        // 버블정렬 수 정렬하기1

        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] array = new int[N];

        for(int i = 0; i < N; i++) {
            array[i] = scanner.nextInt();
        }

        for (int i = 0; i < N -1; i++) {
            for (int j = 0; j < N - 1 - i; j++) {
                if(array[j] > array[j+1]) {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }

        for (int i = 0; i < N; i++) {
            System.out.println(array[i]);
        }
    }
}
