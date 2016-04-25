import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Problem03LargestSequenceOfEqualStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] elements = scanner.nextLine().split(" ");
        List<String> curruntList = new ArrayList<String>();
        List<String> resultList = new ArrayList<String>();

        if (elements.length > 1) {
            for (int i = 0; i < elements.length - 1; i++) {
                if (curruntList.isEmpty()) {
                    curruntList.add(elements[i]);
                }
                if (elements[i].equals(elements[i + 1])) {
                    curruntList.add(elements[i + 1]);
                } else {
                    if (curruntList.size() > resultList.size()) {
                        resultList.clear();
                        for (String element :
                                curruntList) {
                            resultList.add(element);
                        }
                    }

                    curruntList.clear();
                }

                if (i + 1 == elements.length - 1) {
                    if (curruntList.size() > resultList.size()) {
                        resultList.clear();
                        for (String element :
                                curruntList) {
                            resultList.add(element);
                        }
                    }
                }
            }
        } else {
            resultList.add(elements[0]);
        }

        for (String element :
                resultList) {
            System.out.print(element + " ");
        }
    }
}