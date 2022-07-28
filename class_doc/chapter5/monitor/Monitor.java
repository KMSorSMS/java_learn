package chapter5.monitor;

import chapter5.person.Person;
import chapter5.student.Students;

public class Monitor extends Students {
    //班长的任期
    private int chairTime;

    public void holdClass(){
        System.out.println("班长能管教室安静");
    }
    public Monitor(){
        this.chairTime = 0;
        this.setLikes(50);
    }
    public void addChairTime(){
        this.chairTime++;
    }
    public static void main(String[] args){
        Monitor mon1 = new Monitor();
        Students stu1 = new Students();
        Students stu2 = new Students();
        Students.addStuinRoster(stu1, 1);
        Students.addStuinRoster(mon1,2);
        stu1.setAge(18);
        stu1.setIQ(150);
        stu1.setName("wangcai");
        stu1.setIdentity("Student");
        stu1.vote(stu1);
        //能够调用简介父类的方法
        mon1.setAge(18);
        mon1.setName("gougou");
        mon1.setIQ(180);
        mon1.setIdentity("Monitor");
        mon1.vote(stu1);
        mon1.vote(stu2);
        System.out.println("他的name  "+stu1.getName()+"  IQ"+stu1.getIQ()+"  identity"+stu1.getIdentity());
        System.out.println("他的name  "+mon1.getName()+"  IQ"+mon1.getIQ()+"  identity"+mon1.getIdentity());

    }
}
