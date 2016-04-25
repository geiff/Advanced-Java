import java.util.Arrays;
import java.util.Scanner;

public class Problem01SortArrayOfNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.nextLine();
        String line = scan.nextLine();
        String[] inputNum = line.split(" ");
        int[] numbers = new int[n];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(inputNum[i]);
        }

        Arrays.sort(numbers);
        for (Integer num:numbers ) {
            System.out.printf(num + " ");
        }
    }
}