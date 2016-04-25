import java.io.*;

public class Problem02AllCapitals {
    public static void main(String[] args) throws IOException {
        BufferedReader readInput = new BufferedReader(new FileReader(new File("resourses/lines.txt")));
        BufferedWriter writer = new BufferedWriter(new FileWriter(new File("resourses/lines_toUpper.txt")));
        PrintWriter print = new PrintWriter("resourses/lines_toUpper.txt");

       String line = readInput.readLine();
        while (line != null){
            String output = line.toUpperCase();
            writer.write(output);
            print.println(output);
            line = readInput.readLine();
        }

        readInput.close();
        writer.close();
        print.close();
    }
}