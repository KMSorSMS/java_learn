package hw_6_teacher;
import person.*;
import static java.lang.System.*;
/**
 * copyright (c) yzw <br>
 * relax after work<br>
 * crazy things<br>
 * <a href="https://github.com/KMSorSMS/java_learn/tree/test_with_family>click me baby</a><br>" 
 */
public class Teacher_extd extends Person_normal {
/**
 * 重写父类
 */
public  int field_test = 2;
    public void eat(){
        out.println("I'm a teacher and eat in restaurant 重写父类方法");
    }
    /**
     * 扩展父类方法
     */
    public void teach(){
        out.println("I'm a teacher and am teaching");
    }
    public void test_part(){
        out.println("继承的父类的field_test是"+super.field_test);
        out.println("自己的field_test是"+field_test);
        out.println("自己的field_test是(用this的写法)"+this.field_test);

    }
}
