package chapter5.teacher;

import chapter5.person.Person;
import chapter5.student.Students;

public class Teacher extends Person {
    //实例化初始化块
    {
        this.setIdentity("Teacher");

    }
    public void Teaching(String subject){
        System.out.println("我在教"+subject+"课");
    }
    public void checkStu(){
        for(int i=1;i<=Students.getRosterLen();i++){
            Students stutemp = Students.getStuFromRoster(i);
            if(stutemp!=null&&stutemp.getClassAttend()==true){
                stutemp.addAttendTime();
                System.out.println("记录学生在上课了");
            }
        }
    }
}
