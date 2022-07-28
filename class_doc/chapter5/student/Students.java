package chapter5.student;

import chapter5.person.Person;

public class Students extends Person {
    // 学生的花名册就在上面
    private static Students[] roster;
    private static int stuNum;
    // 标记学生是否上课
    private Boolean classAttend;
    // 记录上课次数
    private int attendTime;
    static {
        setStuNum(1);
        setroster(20);
    }
    {
        this.attendTime = 0;
        this.classAttend = true;
        System.out.println("实例初始化设置了学生最开始的上课情况为" + this.classAttend + "  上课时间为：" + this.attendTime);
    }

    public void addAttendTime() {
        this.attendTime++;
    }

    public boolean getClassAttend() {
        return this.classAttend;
    }

    public void setClassAttend(String message) {
        if (message.equals("上课")) {
            System.out.println("设置学生是在上课状态");
            this.classAttend = true;
            return;
        } else if (message.equals("下课")) {
            this.classAttend = false;
            System.out.println("设置学生是在下课状态");
            return;
        } else {
            System.out.println("输入信息有误，请符合规范：上课or下课");
        }

    }

    /**
     * 建立花名册
     * 
     * @param number 初始化学生花名册的容量
     */

    public static void setroster(int number) {
        Students[] rosTemp = new Students[number];
        // 如果之前已经就存在了花名册
        if (roster != null) {
            // 如果需要的大小更大
            if (roster.length < number) {
                System.arraycopy(roster, 0, rosTemp, 0, roster.length);

            }
            // 不然就保持原大小
            else {
                return;

            }
        }
        // 若之前没有花名册
        Students.roster = rosTemp;
    }

    /**
     * 
     * @param stuNum 学生人数
     */
    public static void setStuNum(int stuNum) {
        Students.stuNum = stuNum;
    }

    public static void addStu() {
        Students.stuNum++;
    }

    /**
     * 
     * @return 返回当前学生人数
     */
    public static int getStuNum() {
        return stuNum;
    }

    /**
     * 学生的花名册增加人数
     * 
     * @param stu   需要加入的学生
     * @param index 学生加入的位置
     */

    public static void addStuinRoster(Students stu, int index) {
        // 如果加进去没有空的地方,先将roster变大
        if (Students.roster.length < index) {
            setroster(index);
        }
        if (Students.roster != null) {
            roster[index - 1] = stu;
            addStu();
        } else {
            System.out.println("学生的roster还未建立，请先建立roster");
        }
    }

    public static int getRosterLen() {
        return roster.length;
    }

    public static Students getStuFromRoster(int index) {
        return roster[index];
    }

    /**
     * 
     * @param stu 投票的学生对象
     */
    public void vote(Students stu) {
        // 找到这个student在不在学校里
        for (Students student : roster) {
            if (stu == student) {
                stu.addLikes();
                return;
            }
        }
        System.out.println("学生未被记录在roster（花名册里）");
    }

    public static void main(String[] ags) {
        Students stu1 = new Students();
        stu1.getLikes();
        Students.addStuinRoster(stu1, 2);
        stu1.setAge(18);
        stu1.setIQ(150);
        stu1.setName("wangcai");
        stu1.setIdentity("Student");
        stu1.vote(stu1);
        stu1.getLikes();
        System.out.println("他的name  " + stu1.getName() + "  IQ" + stu1.getIQ() + "  identity" + stu1.getIdentity());
    }
}
