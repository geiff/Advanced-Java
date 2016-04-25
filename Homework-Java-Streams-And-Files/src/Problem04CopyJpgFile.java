import java.io.*;

public class Problem04CopyJpgFile {
    public static void main(String[] args) {
        try (FileInputStream cat = new FileInputStream("resourses/cat.jpg");
             FileOutputStream copyCat = new FileOutputStream("resourses/my-copied-picture.jpg")){
            byte[] buffer = new byte[4096];
                while (true){
                    int readsByte = cat.read(buffer, 0, buffer.length);
                    if (readsByte <= 0){
                        break;
                    }

                    copyCat.write(buffer, 0, readsByte);
                }

        } catch (FileNotFoundException e) {
            System.out.printf("File not found!");
        } catch (IOException e) {
            System.out.printf(e.toString());
       }
    }
}