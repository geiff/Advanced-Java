import java.util.Locale;
import java.util.Scanner;

public class Problem03FormattingNumbers {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("en", "US"));
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        float b = scan.nextFloat();
        float c  = scan.nextFloat();
        String bynary = Integer.toBinaryString(a);

        System.out.printf("|%-10S|%010d|%10.2f|%-10.3f|", Integer.toHexString(a), Integer.parseInt(bynary), b, c);
    }
}