import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Problem01ExtractEmails {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();

        String regex = "(?<=\\s|^)([a-z0-9]+(?:[_.-][a-z0-9]+)*@[a-z]+\\-?[a-z]+(?:\\.[a-z]+)+)\\b";
        Pattern patern = Pattern.compile(regex);
        Matcher matches = patern.matcher(text);

        while (matches.find()){
            System.out.println(matches.group());
        }
    }
}