import java.io.*;

public class Problem01SumLines {

    public static void main(String[] args) throws IOException{
       BufferedReader readInpuData = new BufferedReader(new FileReader("resourses/lines.txt"));
        String line = readInpuData.readLine();
        while (line != null) {
            int sumChar = 0;
            for (int i = 0; i < line.length(); i++) {
                sumChar += line.charAt(i);
            }

            System.out.println(sumChar);
            line = readInpuData.readLine();
        }

       readInpuData.close();
    }
}