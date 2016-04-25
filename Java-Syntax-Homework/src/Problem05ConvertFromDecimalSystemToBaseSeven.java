import java.util.Scanner;

public class Problem05ConvertFromDecimalSystemToBaseSeven {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Integer number = scan.nextInt();

        System.out.println(Integer.toString(number, 7));
    }
}