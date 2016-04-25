import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Problem06CountSpecifiedWord {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();
        text = text.toLowerCase();
        String word = scan.nextLine();
        word = word.toLowerCase();

        String regex = "\\b" + word + "\\b";
        Pattern patern = Pattern.compile(regex);
        Matcher mathes = patern.matcher(text);

        int count = 0;
        while (mathes.find()) {
            count++;
        }

        System.out.println(count);
    }
}