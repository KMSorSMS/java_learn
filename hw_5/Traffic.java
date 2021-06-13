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
public class Traffic {
    /**
     * 定义了:<br>
     * 
     * @param capacity   定义交通工具的容量（初始化块中定义1000）
     * @param price      定义价格
     * @param person_num 人数
     */
    private int capacity;
    private double price;
    private int person_num;
    /**
     * 初始化块定义capacity是1000
     */
    {
        var num = 1000;
        capacity = num;
    }

    /**
     * 设置价格
     * 
     * @param price 传入价格（double类型）
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * 得到价格值
     * 
     * @return double 类型的价格
     */

    public double getPrice() {
        return price;
    }

    public void setPerson_num(int person_num) {
        this.person_num = person_num;
    }

    public int return_left() {
        return capacity - person_num;
    }

    /**
     * 提供单次增加人数的方法
     */
    public void add_num() {
        this.person_num++;
        check();
        out.println("A person is just added in carrier");
    }

    /**
     * 提供检查人数的方法，在人数距可容量还有20以内时报警
     */

    public void check() {
        if (person_num >= capacity - 20) {
            alarm();
        }
    }

    /**
     * 进行警报 private方法，用在check里面；
     */
    private void alarm() {
        out.println("Warning the capacity is close to null");
    }
}
