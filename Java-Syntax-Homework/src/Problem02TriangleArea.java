import java.text.DecimalFormat;
import java.util.Scanner;

public class Problem02TriangleArea {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int ax = scan.nextInt();
        int ay = scan.nextInt();
        scan.nextLine();
        int bx = scan.nextInt();
        int by = scan.nextInt();
        scan.nextLine();
        int cx = scan.nextInt();
        int cy = scan.nextInt();

        calculateArea(ax, ay, bx, by, cx, cy);
    }

    public static void calculateArea (int ax, int ay, int bx, int by, int cx, int cy){
        double area = Math.abs((ax * (by - cy) + bx * (cy - ay) + cx * (ay - by)) / 2);
        System.out.printf(new DecimalFormat("##.##").format(area));
    }
}