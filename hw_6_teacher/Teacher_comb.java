package hw_6_teacher;
import person.*;
/**
 * copyright (c) yzw <br>
 * relax after work<br>
 * crazy things<br>
 * <a href="https://github.com/KMSorSMS/java_learn/tree/test_with_family>click me baby</a><br>" 
 */
public class Teacher_comb {
    /**
     * 需要组合的类，建立一个对象<br>
     * 用它的public方法
     */
    Person_normal p;
    /**
     * 实现组合，初始化一个类的实例
     * @param p 正常人的实例
     */
    public Teacher_comb(Person_normal p){
        this.p = p;
    }
    public void drink(){
        p.drink();
    }
    public void setName(String name){
        p.setName(name);
    }
    public String getName(){
        return p.getName();
    }
}
