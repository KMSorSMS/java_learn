package chapter_3;
/**
 * @author Yzw
 * @version 1.0
 */
public class Student {
    /**
     * 测试文档功能<br>及编写表达式
     */
    public int age;
    public int gender;
    public String name;
    /**
     * Students构造器
     */
    public Student(){
    }
    /**
     * 
     * @param name:学生姓名
     * @return ：你好
     */
    public String hello(String name){
        return name+"hello";
    }
    public static void main(String[] args){
        System.out.println(5-3+2+1==3?"5大于3":"5不大于3");
    }
}
