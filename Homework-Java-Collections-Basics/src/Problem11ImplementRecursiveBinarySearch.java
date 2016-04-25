import java.util.Arrays;
import java.util.Scanner;

public class Problem11ImplementRecursiveBinarySearch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.nextLine();
        String[] inputNum = scan.nextLine().split(" ");
        Comparable[] numbers = new Integer[inputNum.length];

        for (int i = 0; i < inputNum.length; i++) {
            numbers[i] = Integer.parseInt(inputNum[i]);
        }

        Arrays.sort(numbers);

        int star = 0;
        int end = numbers.length - 1;

        System.out.println(recursiveBinarySearch(n, numbers, star, end));
    }

    private static int recursiveBinarySearch(Comparable n, Comparable[] numbers, int start, int end) {
        if (start > end) {
            return -1;
        }

        int mid = start + (end - start) / 2;

        if (numbers[mid].compareTo(n) < 0) {
            return recursiveBinarySearch(n, numbers, mid + 1, end);
        } else {

            if (numbers[mid].compareTo(n) > 0) {
                return recursiveBinarySearch(n, numbers, start, mid - 1);
            } else {
               return mid;
           }
        }
    }
}