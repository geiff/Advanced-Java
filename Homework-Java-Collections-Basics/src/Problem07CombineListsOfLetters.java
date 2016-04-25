import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Problem07CombineListsOfLetters {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String listOneInput = scan.nextLine();
        List<Character> listOne = new ArrayList<>();
        String listTwoInput = scan.nextLine();
        List<Character> listTwo = new ArrayList<>();
        List<Character> outputList = new ArrayList<>();

        for (int i = 0; i < listOneInput.length(); i += 2) {
            char c = listOneInput.charAt(i);
            listOne.add(c);
        }


        for (int i = 0; i < listTwoInput.length(); i += 2) {
            char c = listTwoInput.charAt(i);
            listTwo.add(c);
        }

        for (int i = 0; i < listOne.size(); i++) {
            outputList.add(listOne.get(i));
        }

        for (int i = 0; i < listTwo.size(); i++) {
            boolean isAppear = false;
            for (int j = 0; j < listOne.size(); j++) {
                if (listTwo.get(i).equals(listOne.get(j))) {
                    isAppear = true;
                    break;
                }
            }

            if (isAppear == false) {
                outputList.add(listTwo.get(i));
            }
        }

        for (int i = 0; i < outputList.size(); i++) {
            System.out.printf(outputList.get(i) + " ");
        }
    }
}