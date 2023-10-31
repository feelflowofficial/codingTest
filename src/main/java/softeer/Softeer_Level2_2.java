package softeer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.StringTokenizer;

public class Softeer_Level2_2 {
    // 8단변속기

    public static Integer[] numbers = {1, 2, 3, 4, 5, 6, 7, 8};
    public static boolean compare(Integer[] numbers, Integer[] inputNumbers) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] != inputNumbers[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]) throws IOException
    {
        BufferedReader bufferdReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferdReader.readLine());

        Integer[] inputNumbers = new Integer[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            inputNumbers[i] = Integer.parseInt(stringTokenizer.nextToken());
        }

        Integer[] numbersReverse = new Integer[numbers.length];
        System.arraycopy(numbers, 0, numbersReverse, 0, numbers.length);
        Arrays.sort(numbersReverse, Collections.reverseOrder());

        if (compare(numbers, inputNumbers) == true) {
            System.out.println("ascending");
        } else if (compare(numbersReverse, inputNumbers) == true) {
            System.out.println("descending");
        } else {
            System.out.println("mixed");
        }
    }

}
