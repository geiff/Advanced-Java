import java.util.Scanner;

public class Problem12CalculateNFactoriel {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        System.out.println(printFactoriel(n));
    }

    private static int printFactoriel(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }

        return n * printFactoriel(n - 1);
    }
}