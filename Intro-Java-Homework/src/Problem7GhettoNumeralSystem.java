import java.util.Scanner;

public class Problem7GhettoNumeralSystem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String numberInput = scan.next();
        String result = new String();
        for (int i = 0; i < numberInput.length(); i++) {
            int number = Integer.parseInt(String.valueOf(numberInput.charAt(i)));
            switch (number) {
                case 0:
                    result += "Gee";
                    break;
                case 1:
                    result += "Bro";
                    break;
                case 2:
                    result += "Zuz";
                    break;
                case 3:
                    result += "Ma";
                    break;
                case 4:
                    result += "Duh";
                    break;
                case 5:
                    result += "Yo";
                    break;
                case 6:
                    result += "Dis";
                    break;
                case 7:
                    result += "Hood";
                    break;
                case 8:
                    result += "Jam";
                    break;
                case 9:
                    result += "Mack";
                    break;
            }
        }
        System.out.print(result);
    }
}