package chapter5.school;
/**
 * 我认为school应该是teacher、students、monitor这些的总和
 */

import chapter5.teacher.Teacher;
import chapter5.student.Students;

public class School {
    private Teacher tea;
    private Students stu;
    /**
     * 
     * @param tea 要组合进去的Teacher实例
     * @param stu 要组合进去的Students实例
     */
    public School(Teacher tea,Students stu){
        this.tea = tea;
        this.stu = stu;
    }
    /**
     * 建立学校学生花名册roster
     * @param number
     */
    public void setroster(int number){
        Students.setroster(number);
    }
    public void addStuinoister(Students stu,int index){
        Students.addStuinRoster(stu, index);
    }
    /**
     * 对于不同的学生设置他的上课情况
     * @param message 上课情况
     * @param stu1 学生对象
     */
    public void setClassAttend(String message,Students stu1){
        stu1.setClassAttend(message);
    }
    /**
     * 学生上课时间增加
     * @param stu1 学生对象
     */
    public void addAttendTime(Students stu1){
        stu1.addAttendTime();
    }
    /**
     * 学校的选举机制
     * stu1选stu2
     * @param stu1 学生一是投票者
     * @param stu2 学生二是被选者
     */
    public void vote(Students stu1,Students stu2){
        stu1.vote(stu2);
    }
    /**
     * 点名机制
     */
    public void checkStu(){
        tea.checkStu();
    }
    /**
     * 组合的基础上又专属于School的方法
     * 视察上什么课程
     * @param subject
     */
    public void checkTeaching(String subject){
        System.out.println("老师在教"+subject+"课");
    }


}
