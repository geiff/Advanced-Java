import java.util.Scanner;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Problem08ExtractAllUniqueWords {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine().toLowerCase();

        TreeSet output = new TreeSet();
        String regex = "\\w+";
        Pattern patern = Pattern.compile(regex);
        Matcher matches = patern.matcher(text);

        while (matches.find()){
            String word = matches.group();
            output.add(word);
        }

        for (Object str:output) {
            System.out.print(str + " ");
        }
    }
}