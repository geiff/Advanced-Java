import java.util.*;
import java.util.stream.Collectors;

public class Problem02SortArrayWithStreamAPI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] elements = scanner.nextLine().split(" ");
        String command = scanner.nextLine();

        List<Integer> numbers = Arrays.stream(elements)
                .map(p -> Integer.parseInt(p))
                .collect(Collectors.toList());

        if (command.contains("Ascending")) {
            numbers.stream()
                    .sorted()
                    .forEach(p -> System.out.printf(p + " "));
        } else {
            if (command.contains("Descending")) {
                numbers.stream()
                        .sorted(Comparator.reverseOrder())
                        .forEach(p -> System.out.printf(p + " "));
            }
        }
    }
}