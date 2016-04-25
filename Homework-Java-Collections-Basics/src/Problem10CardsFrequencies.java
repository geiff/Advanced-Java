import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Problem10CardsFrequencies {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);
        Scanner scan = new Scanner(System.in);
        String line = scan.nextLine();

        String regex = "[A-z0-9]+";
        Pattern patern = Pattern.compile(regex);
        Matcher matches = patern.matcher(line);

        LinkedHashMap<String, Integer> output = new LinkedHashMap<>();

        List<String> faces = new ArrayList<>();
        while (matches.find()) {
            faces.add(matches.group());
        }

        for (String face : faces) {
            Integer count = output.get(face);
            if (count == null) {
                count = 0;
            }

            output.put(face, count + 1);
        }

        for (String face : output.keySet()) {
            int count = output.get(face);
            double countPercent = ((double) count / faces.size()) * 100;
            System.out.printf("%s -> %.2f", face, countPercent);
            System.out.println("%");

        }
    }
}