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

public class Tractor extends Vehicle {
    private double radius;
    private String style = "";

    /**
     * 含参数的构造器，定义radius（半径）的唯一机会
     * 
     * @param radius
     */
    public Tractor(double radius) {
        // super(8.0);
        this.radius = radius;
        out.println("调用了tractor的构造器");
    }

    /**
     * 不含参数的构造器
     */
    public Tractor() {
        out.println("注意你调创造的对象没有对radius赋值，它被允许在调用构造器的时候被赋值");
    }

    /**
     * @param style 描述样式
     */
    public void setStyle(String style) {
        out.println("开始设置style");
        this.style += style;
    }
/**
 * 实现抽象类的方法<br>
 * 打印全部信息
 */
    public void print() {
        out.println(style);
        var speed = getSpeed();
        out.println("我是一个tractor，我的半径（radius）是：" + radius + " 我的速度是：" + speed);
        // out.println("有修改");
    }

    /**
     * 返回车轮半径
     */
    public double getRadius(){
        return radius;
    }

    public static void main(String[] args) {
        Tractor tcr = new Tractor(3.0);
        tcr.setTurnRate(10);
        tcr.setStyle("蠢蠢的拖拉机");
        // out.println(tcr.getSpeed());
        tcr.print();

        Track tra = new Track(5);
        tra.setTurnRate(12);
        tra.setStyle("大大的货车");
        tra.print();

        Car car = new Car(7);
        car.setTurnRate(15);
        car.setStyle("靓丽的小车");
        car.setStyle("beautiful car");
        car.print();
    }
}
