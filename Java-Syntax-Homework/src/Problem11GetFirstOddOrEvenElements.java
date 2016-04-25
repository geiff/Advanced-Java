import java.util.ArrayList;
import java.util.Scanner;

public class Problem11GetFirstOddOrEvenElements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] inputNumbers = scan.nextLine().split(" ");
        String[] commands = scan.nextLine().split(" ");

        int[] numbers = new int[inputNumbers.length];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(inputNumbers[i]);
        }

        int numPrint = Integer.parseInt(commands[1]);
        String oddOrEvvenCommand = commands[2];

        ArrayList<Integer> listResult = firstOddOrEvenElements(numbers,oddOrEvvenCommand, numPrint);
        for (Integer element: listResult ) {
            System.out.printf(element + " ");
        }
    }

    public static ArrayList<Integer> firstOddOrEvenElements (int[] numbers, String oddOrEvvenCommand, int numPrint) {
        ArrayList<Integer> listResult = new ArrayList<>();
        if (oddOrEvvenCommand.equals("odd")) {
            int index = 0;
            int count = 1;

            while (index < numbers.length && count <= numPrint) {
                if (numbers[index] % 2 != 0) {
                    listResult.add(numbers[index]);
                    count++;
                }

                index++;
            }
        }

        if (oddOrEvvenCommand.equals("even")) {
            int index = 0;
            int count = 1;

            while (index < numbers.length && count <= numPrint) {
                if (numbers[index] % 2 == 0) {
                    listResult.add(numbers[index]);
                    count++;
                }

                index++;
            }
        }

        return listResult;
    }
}