import java.util.Scanner;

public class Problem10CharacterMultiplier {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str1 = scan.next();
        String str2 = scan.next();

        System.out.println(multiplierChar(str1, str2));
    }

    public  static int multiplierChar(String str1, String str2) {
        int sum = 0;

        if (str1.length() < str2.length()) {
            for (int i = 0; i < str1.length(); i++) {
                sum += str1.charAt(i) * str2.charAt(i);
            }

            for (int i = 0 + str1.length(); i < str2.length(); i++) {
                sum += str2.charAt(i);
            }
        } else {
            for (int i = 0; i < str2.length(); i++) {
                sum += str1.charAt(i) * str2.charAt(i);
            }

            for (int i = 0 + str2.length(); i < str1.length(); i++) {
                sum += str1.charAt(i);
            }
        }

        return sum;
    }
}