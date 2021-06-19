package chapter6;

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
public class Track extends Vehicle {
    private double radius;
    private String style = "";

    /**
     * 唯一指定半径的机会
     * 
     * @param radius
     */
    public Track(double radius) {
        out.println("含参数track的构造器");
        this.radius = radius;
    }

    /**
     * 不含参数的构造器
     */
    public Track() {
        out.println("注意你调创造的对象没有对radius赋值，它被允许在调用构造器的时候被赋值");
    }

    /**
     * 返回当前的radius
     */
    public double getRadius() {
        return radius;
    }

    /**
     * @param style 样式设置
     */
    public void setStyle(String style) {
        out.println("设置style");
        this.style += style;
    }

    public void print() {
        out.println("我是个Track喔");
        out.println(style);
        out.println("速度是：" + getSpeed());
    }
}
