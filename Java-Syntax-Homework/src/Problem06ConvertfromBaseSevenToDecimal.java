import java.util.Scanner;

public class Problem06ConvertfromBaseSevenToDecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String numberStr = scanner.next();

        int number = Integer.valueOf(numberStr,7);
        System.out.print(number);
    }
}