package hw_5;

/**
 * copyright (c) yzw <br>
 * relax after work<br>
 * crazy things<br>
 * <a href="https://github.com/KMSorSMS/java_learn/tree/test_with_family">click me baby</a><br>
 *
 * 
 * @author yzw
 * @version 1.0
 */

public class Main_1 extends Test_private {
    /**
     * 单纯的实验了一下继承后<br>
     * 用父类的构造器，并且绕过父类的private构造器
     */
    public Main_1() {
        super("Jack");
        java.lang.System.out.println("子类初始化结束");
    }

    /**
     * 程序的入口
     * 
     * @param args 你随意
     */
    public static void main(String[] args) {
        Car car_1 = new Car();
        Car car_2 = new Car(979);
        car_1.character();
        car_2.character();
        car_1.add_num();
        car_2.add_num();
        // Test_private ts = new Test_private();
        Test_private ts1 = new Test_private("Liam");
        Main_1 ma_1 = new Main_1();
    }
}
