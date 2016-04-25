import java.util.LinkedHashMap;
import java.util.Scanner;

public class Problem07MagicExchangeableWords {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String wordFirst = scan.next();
        String wordSecond = scan.next();

        System.out.println(isMagicWords(wordFirst, wordSecond));
    }

    private static boolean isMagicWords(String wordFirst, String wordSecond) {
        LinkedHashMap<Character, Character> magicWords = new LinkedHashMap<>();
        boolean isMagic = false;
        for (int i = 0; i < wordFirst.length(); i++) {
            if (!magicWords.containsKey(wordFirst.charAt(i))) {
                magicWords.put(wordFirst.charAt(i), wordSecond.charAt(i));
            } else {
                if (magicWords.get(wordFirst.charAt(i)) == wordSecond.charAt(i)) {
                    isMagic = true;
                } else {
                    isMagic = false;
                    break;
                }
            }
        }

        return isMagic;
    }
}