import java.util.Scanner;

public class Problem5PrintACharacterTriangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n  = scan.nextInt();

        for (int i = 0; i <= n; i++){
            for (char c = 'a'; c < 'a' + i; c++){
                System.out.print(c + " ");
            }
            System.out.println("");
        }

        for (int i = n - 1; i >= 0; i--){
            for (char c = 'a'; c < 'a' + i; c++){
                System.out.print(c + " ");
            }
            System.out.println("");
        }
    }
}