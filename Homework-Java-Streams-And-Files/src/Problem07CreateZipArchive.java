import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class Problem07CreateZipArchive {
    public static void main(String[] args) {
        try (FileOutputStream outputZip = new FileOutputStream("resourses/text-files.zip");
             ZipOutputStream zip = new ZipOutputStream(outputZip)) {

            String fileNameWords = "resourses/words.txt";
            String fileNameChars = "resourses/count-chars.txt";
            String fileNameLines = "resourses/lines.txt";

            addToZipFile(fileNameWords, zip);
            addToZipFile(fileNameChars, zip);
            addToZipFile(fileNameLines, zip);

            } catch (FileNotFoundException e) {
            System.out.printf(e.toString());
        } catch (IOException e) {
            System.out.printf(e.toString());
        }
    }

    public static void addToZipFile(String fileName, ZipOutputStream zip) throws IOException {
        File file = new File(fileName);
        FileInputStream fileInput = new FileInputStream(file);
        ZipEntry zipEntry = new ZipEntry(fileName);
        zip.putNextEntry(zipEntry);
        byte[] bytes = new byte[1024];
        int lenght;
        while ((lenght = fileInput.read(bytes)) >= 0){
            zip.write(bytes, 0, lenght);
        }

        zip.closeEntry();
        fileInput.close();
    }
}