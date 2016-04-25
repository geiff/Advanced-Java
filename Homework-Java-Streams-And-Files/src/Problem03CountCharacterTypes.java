import java.io.*;

public class Problem03CountCharacterTypes {
    public static void main(String[] args) throws IOException {
        BufferedReader data = new BufferedReader(new FileReader("resourses/words.txt"));
        BufferedWriter writer = new BufferedWriter(new FileWriter("resourses/count-chars.txt", false));
        PrintWriter print = new PrintWriter("resourses/count-chars.txt");

        int vowels = 0;
        int punctuation = 0;
        int consonants = 0;

        String line = data.readLine();

        while (line != null){
            for (int i = 0; i < line.length(); i++) {
                if (line.charAt(i) == 'a' || line.charAt(i) == 'e' || line.charAt(i) == 'i' ||
                        line.charAt(i) == 'o' || line.charAt(i) == 'u'){
                    vowels++;
                }

                if (line.charAt(i) == '!' || line.charAt(i) == '.' || line.charAt(i) == '?' ||
                        line.charAt(i) == ','){
                    punctuation ++;
                }

                if (line.charAt(i) != 'a' && line.charAt(i) != 'e' && line.charAt(i) != 'i' &&
                        line.charAt(i) != 'o' && line.charAt(i) != 'u' && line.charAt(i) != '!' &&
                        line.charAt(i) != '.' && line.charAt(i) != '?' && line.charAt(i) != ','
                        && line.charAt(i) != ' ') {
                    consonants++;
                }
            }
            line = data.readLine();
        }
        writer.write(vowels);
        writer.write(consonants);
        writer.write(punctuation);

        print.printf("Vowels: %d\nConsonants: %d\nPunctuation: %d\n",vowels, consonants, punctuation);
        data.close();
        writer.close();
        print.close();
    }
}