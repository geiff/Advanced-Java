import java.util.Scanner;

public class Problem02CountSubstringOccurrences {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine().toLowerCase();
        String word = scan.nextLine().toLowerCase();

        int count = 0;
        int index = 0;

        while (index < text.length()) {
            int indexResult = text.indexOf(word, index);
            if (indexResult >= 0) {
                count++;
                index = indexResult + 1;
            } else {
                index = text.length();
            }
        }

        System.out.println(count);
    }
}