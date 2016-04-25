import java.util.Locale;
import java.util.Scanner;

public class Problem04CalculateExpression {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("en", "US"));
        Scanner scan = new Scanner(System.in);
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double c = scan.nextDouble();

        double resultF1 = Math.pow((Math.pow(a, 2) + Math.pow(b, 2)) / (Math.pow(a, 2) - Math.pow(b, 2)),
                                   (a + b + c)/ Math.sqrt(c)) ;
        double resultF2 = Math.pow((Math.pow(a, 2) + Math.pow(b, 2) - Math.pow(c, 3)),
                                    (a - b));
        double averNumbers = (a + b + c) / 3;
        double averFormula = (resultF1 + resultF2) / 2;
        double diff = Math.abs(averNumbers - averFormula);
        System.out.printf("F1 result: %.2f; F2 result: %.2f; Diff: %.2f", resultF1, resultF2, diff);
    }
}