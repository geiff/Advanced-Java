package Problem06SaveACustomObjectInAFile;
import sun.net.www.http.ChunkedOutputStream;
import java.io.*;

public class Main {
    private static Course[] courses;
    public static void main(String[] args) {
        courses = new Course[3];
        courses[0] = new Course("IT", 120);
        courses[1] = new Course("MIO", 100);
        courses[2] = new Course("Satistica", 85);

        saveObject();
        loadObject();
    }

    private static void saveObject(){
        try (ObjectOutputStream outObject = new ObjectOutputStream(new BufferedOutputStream(
                new FileOutputStream("resourses/course.save")))){

            for (Course c: courses){
                outObject.writeObject(c);
            }

        } catch (FileNotFoundException e) {
            System.out.printf(e.toString());
        } catch (IOException e) {
            System.out.printf(e.toString());
        }
    }

    private static void loadObject() {
        try (ObjectInputStream inputObject = new ObjectInputStream(new BufferedInputStream(
                new FileInputStream("resourses/course.save")))){
            Object obj;
            while ((obj = inputObject.readObject()) != null){
                System.out.println(obj);
            }

        } catch (FileNotFoundException e) {
            System.out.printf(e.toString());
        } catch (IOException e) {
            System.out.printf("END OF FILE!");
        } catch (ClassNotFoundException e) {
            System.out.printf(e.toString());
        }

    }
}