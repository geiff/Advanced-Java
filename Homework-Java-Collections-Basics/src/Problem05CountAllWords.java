import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Problem05CountAllWords {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();

        String regex = "\\b\\w+\\b";
        Pattern patern = Pattern.compile(regex);
        Matcher matches = patern.matcher(text);

        int count = 0;
        while (matches.find()){
            count++;
        }

        System.out.println(count);
    }
}