package chapter6;

import static java.lang.System.*;
import static java.lang.Math.*;
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

public abstract class Vehicle {
    /**
     * the initial part of Vehicle's field;<br>
     * 抽象车类的实例初始化块<br>
     * 注意这是在创建子类实例时会被调用的
     */
    {
        out.println("I'm executing the initial part!");
    }

    /**
     * @param radius abstract里面都拥有的半径
     */
    private double turnRate;
    private double radius;

    /**
     * abstract提供的一个构造器<br>
     * 方便子类去调用abstract里面的private成员变量
     * 
     * @param radius 这里是修改的abstract的radius值
     */
    public Vehicle(double radius) {
        out.println("调用了Vehicle的构造器");
        this.radius = radius;
    }

    /**
     * 当然再创建一个无参数默认构造器
     */
    public Vehicle() {
        out.println("调用了Vehicle的无参数默认构造器");
    }

    /**
     * 打印全部信息<br>
     * 根据子类的不同而去选择打印相应信息（所以用abstrac）
     * 
     * 
     */
    public abstract void print();

    /**
     * 
     * @return 车的具体半径，因为该信息在子类里面所以用abstract
     */
    public abstract double getRadius();

    /**
     * 设置具体车的款式信息
     * 
     * @param style 款式信息
     */
    public abstract void setStyle(String style);

    /**
     * 设置轮子的转速<br>
     * 因为是通用的所以不需要子类去具体实现，统一实现即可
     * 
     * @param turnRate 转速
     */
    public void setTurnRate(double turnRate) {
        // 注意这里修改的turnrate是Vehicle对象的turnrate
        // 哪怕是发生继承，只要是调用的这个方法，那么修改的量就一定是父类实例的。
        this.turnRate = turnRate;
    }

    
    /**
     * 定义计算轮子周长<br>
     * 因为大家都是一样算的，就写在abstract里面
     * @return 轮子周长
     */
    public double calGirth(){
        return 2*PI*getRadius();
    }


    /**
     * 得到速度
     */
    public double getSpeed() {
        out.println("计算速度");
        out.println("确认转速是：" + turnRate);
        return calGirth() * turnRate;
    }
}
