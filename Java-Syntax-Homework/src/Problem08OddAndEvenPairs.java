import java.util.Scanner;

public class Problem08OddAndEvenPairs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] inputArr = scan.nextLine().split(" ");
        int[] nums = new int[inputArr.length];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = Integer.parseInt(inputArr[i]);
        }

        if (!(nums.length % 2 == 0)) {
            System.out.printf("Invalid length");
        } else {
            for (int i = 0; i < nums.length - 1; i += 2) {
                if (nums[i] % 2 == 0 && nums[i + 1] % 2 == 0) {
                    System.out.printf("%d, %d -> both are even%n", nums[i], nums[i + 1]);
                } else {
                    if (nums[i] % 2 != 0 && nums[i + 1] % 2 != 0) {
                        System.out.printf("%d, %d -> both are odd%n", nums[i], nums[i + 1]);
                    } else {
                        System.out.printf("%d, %d -> different%n", nums[i], nums[i + 1]);
                    }
                }
            }
        }
    }
}