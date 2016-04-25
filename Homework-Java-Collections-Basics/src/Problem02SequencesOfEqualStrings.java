import java.util.Scanner;

public class Problem02SequencesOfEqualStrings {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] elements = scan.nextLine().split(" ");

        int index = 1;
        int count = 1;
        if (elements.length > 1) {
            while (index < elements.length) {
                if (elements[index - 1].equals(elements[index])) {
                    count++;
                    if (index == elements.length - 1) {
                        for (int i = 0; i < count; i++) {
                            System.out.print(elements[index - 1] + " ");
                        }
                    }

                    index++;

                } else {
                    for (int i = 0; i < count; i++) {
                        System.out.print(elements[index - 1] + " ");
                    }

                    System.out.println();
                    count = 1;
                    if (index == elements.length - 1) {
                        System.out.println(elements[index]);
                    }
                    index++;
                }
            }
        } else {
            System.out.println(elements[index - 1]);
        }
    }
}