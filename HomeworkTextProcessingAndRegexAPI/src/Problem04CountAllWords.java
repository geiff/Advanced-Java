import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Problem04CountAllWords {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();

        String regex = "\\b\\w+\\b";
        Pattern patern = Pattern.compile(regex);
        Matcher matches = patern.matcher(text);

        int count = 0;
        while (matches.find()) {
            count++;
        }

        System.out.println(count);
    }
}