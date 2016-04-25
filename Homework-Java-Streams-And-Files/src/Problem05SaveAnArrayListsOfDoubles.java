import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Problem05SaveAnArrayListsOfDoubles {
   private static List<Double> information = new ArrayList<Double>();
    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);
        information.add(5.2);
        information.add(6.3);
        information.add(7.2);

        saveObject();
        loadObject();
    }

    private static void saveObject() {
        try (ObjectOutputStream outputObject = new ObjectOutputStream(new BufferedOutputStream(
                new FileOutputStream("resourses/doubles.list")))) {
            outputObject.writeObject(information);
        } catch (IOException ioe) {
            System.out.printf(ioe.toString());
        }
    }

    private static void loadObject() {
        try  (ObjectInputStream inputObject = new ObjectInputStream(new BufferedInputStream(
                new FileInputStream("resourses/doubles.list")))){

            System.out.println(inputObject.readObject());

        } catch (ClassNotFoundException ex) {
            System.out.printf(ex.toString());
        } catch (IOException e) {
            System.out.printf(e.toString());
        }
    }
}
