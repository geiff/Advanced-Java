import java.util.Locale;
import java.util.Scanner;

public class Problem8GetAverage {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("en", "US"));
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        printAverage(a, b, c);
    }

    public static void printAverage(double a, double b, double c){
        double avrg = (a + b + c )/ 3;
        System.out.println(String.format("%.2f", avrg));
    }
}