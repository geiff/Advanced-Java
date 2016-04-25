import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Problem09MostFrequentWord {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine().toLowerCase();

        TreeMap<String, Integer> outputWords = new TreeMap<>();

        String regex = "\\w+";
        Pattern patern = Pattern.compile(regex);
        Matcher matches = patern.matcher(text);

        List<String> words = new ArrayList<>();
        while (matches.find()) {
            words.add(matches.group());
        }

        for (String word : words) {
            Integer count = outputWords.get(word);
            if (count == null) {
                count = 0;
            }

            outputWords.put(word, count + 1);
        }

        int maxCount = Integer.MIN_VALUE;
        for (String word : outputWords.keySet()) {
            if (outputWords.get(word) >= maxCount) {
                maxCount = outputWords.get(word);
            }
        }

        for (String word : outputWords.keySet()) {
            if (outputWords.get(word) == maxCount) {
                System.out.printf("%s -> %d times\n", word, outputWords.get(word));
            }
        }
    }
}