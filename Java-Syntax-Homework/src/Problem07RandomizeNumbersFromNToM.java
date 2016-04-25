import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Problem07RandomizeNumbersFromNToM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numbersOne = scanner.nextInt();
        int numbersTwo = scanner.nextInt();

        int min = Math.min(numbersOne, numbersTwo);
        int max = Math.max(numbersOne, numbersTwo);

        Random rnd = new Random();
        List<Integer> nums = new ArrayList();

        for (int i = 0; i <= max - min; i++) {
            int num = rnd.nextInt(max - min +1) + min;

            while (nums.contains(num)) {
                num = rnd.nextInt(max - min +1) + min;
            }
                nums.add(num);
        }

        for (int n: nums) {
         System.out.print(n + " ");
        }
    }
}