package working_area;

import java.util.Scanner;

public class test_file

{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入○的半径：");
        int r = scanner.nextInt();
        // 半径
        test_file jsy = new test_file();
        jsy.PrintCricle(r);
        scanner.close();
    }

    public void PrintCricle(int r) {
        double R = 2 * r;
        // 直径
        for (int i = 0; i <= R; i += 2) {
            // i代表每一行
            double y = Math.round(Math.sqrt(r * r - Math.pow(r - i, 2)));
            // 圆上点到竖着半径的距离
            double x = r - y;
            // 圆上点到外切正方形边的距离
            // 打印正方形左边边到圆上点的空白部分
            for (int j = 0; j < x; j++) {
                System.out.print(" ");
            }
            // 打印左边的圆上点
            System.out.print("*");
            // 打印出中间空白部分
            for (int j = 0; j < 2 * y; j++) {
                System.out.print(" ");
            }
            // 打印出右边圆上点，直接换行
            System.out.println("*");
        }
    }
}
