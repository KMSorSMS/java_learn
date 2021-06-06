package working_area;

import java.lang.Math;
import java.util.Scanner;

public class print_circle {

    public static void main(String[] args) {
        System.out.println("input your round:");
        Scanner scan = new Scanner(System.in);
        while (scan.hasNextInt()) {
            var round = scan.nextInt();

            for (double i = 0; i <= round*2; i = i + 2) {
                var y = Math.round(Math.sqrt(round * round - (round - i) * (round - i)));
                var tab_len = round - y;

                for (int j = 1; j <= tab_len; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
                for (int j = 1; j <= 2 * y; j++) {
                    System.out.print(" ");
                }
                System.out.println("*");
            }
        }
        scan.close();
    }
}
