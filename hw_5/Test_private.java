package hw_5;

import static java.lang.System.*;

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
public class Test_private {
    /**
     * 作为private修饰的构造器<br>
     * 实验用
     */
    private Test_private() {

    }
    /**
     * 可被外部用到的构造器
     * @param name 起名字
     */

    public Test_private(String name) {
        out.println("the name is " + name);
    }
    /**
     * 测试实例方法
     */

    public void test() {
        out.println("this is a test for field method");
    }
    /**
     * 测试类方法
     */

    public static void test_1() {
        out.println("this is a class");
    }
}
