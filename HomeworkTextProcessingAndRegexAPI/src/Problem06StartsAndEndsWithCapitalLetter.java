import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Problem06StartsAndEndsWithCapitalLetter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        String regex = "\\b[A-Z][a-zA-Z]*[A-Z]\\b";
        Pattern patern = Pattern.compile(regex);
        Matcher matcher = patern.matcher(text);

        List<String> result = new ArrayList<>();

        while (matcher.find()) {
            result.add(matcher.group());
        }

        result.forEach(word -> System.out.printf(word + " "));
    }
}