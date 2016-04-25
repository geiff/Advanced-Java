import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Problem01FilterArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] elements = scan.nextLine().split(" ");

        List<String> words = Arrays.stream(elements)
                .filter(word -> word.length() > 3)
                .collect(Collectors.toList());

        words.stream()
                .forEach(word -> System.out.printf(word + " "));
    }
}