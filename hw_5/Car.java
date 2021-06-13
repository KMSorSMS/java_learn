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

import static java.lang.System.*;

import java.util.Scanner;

public class Car extends Traffic {
    /**
     * 无参数初构造器；要求输入加入人数
     * @author yzw
     * @version 1.0
     */
    public Car() {
        out.println("input your initial people capacity");
        var sc = new Scanner(in);
        if (sc.hasNextInt()) {
            this.setPerson_num(sc.nextInt());
            check();
            out.println("So there are " + return_left() + "people left");
        }
        sc.close();
    }
/**
 * 构造器
 * @param peop_in 传入初始化人数
 * @author yzw
 * @version 1.0
 */
    public Car(int peop_in) {
        setPerson_num(peop_in);
        out.println("Check your num " + return_left());
    }
    /**
     * 定义特征方法
     * @author yzw
     * @version 1.0
     */

    public void character() {
        out.println("Travel by car .Get it");
    }
}
