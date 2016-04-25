import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Problem04LongestIncreasingSequence {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] inputnum = scan.nextLine().split(" ");
        int[] numbers = new int[inputnum.length];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(inputnum[i]);
        }

        List<Integer> currentList = new ArrayList<>();
        List<Integer> longestSequence = new ArrayList<>();

        for (int i = 1; i < numbers.length; i++) {
            if (currentList.isEmpty()) {
                currentList.add(numbers[i - 1]);
            }
            if (numbers[i - 1] < numbers[i]) {
                currentList.add(numbers[i]);
            } else {
                for (int j = 0; j < currentList.size(); j++) {
                    System.out.print(currentList.get(j));
                    System.out.printf(" ");
                }

                System.out.println();
                if (currentList.size() > longestSequence.size()) {
                    longestSequence.clear();
                    for (int j = 0; j < currentList.size(); j++) {
                        longestSequence.add(currentList.get(j));
                    }
                }

                currentList.clear();
                if (i == numbers.length - 1) {
                    currentList.add(numbers[i]);
                }
            }

            if (i == numbers.length - 1) {
                for (int j = 0; j < currentList.size(); j++) {
                    System.out.print(currentList.get(j));
                    System.out.print(" ");
                }
                System.out.println();
                if (currentList.size() > longestSequence.size()) {
                    longestSequence.clear();
                    for (int j = 0; j < currentList.size(); j++) {
                        longestSequence.add(currentList.get(j));
                    }
                }

            }
        }

        System.out.print("Longest: ");
        for (int i = 0; i < longestSequence.size(); i++) {
            System.out.print(longestSequence.get(i));
            System.out.printf(" ");
        }
    }
}