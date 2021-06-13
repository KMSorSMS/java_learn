
package working_area;

import static java.lang.System.*;
import person.*;
import hw_6_students.*;
import hw_6_teacher.*;

public class main_dev1 {
    // 构建一个学生类对象的数组
    private static Students[] sts_array(int num) {
        Students[] sts_ar = new Students[num];
        int i = 1;
        for (int j=0;j<num;j++) {
            sts_ar[j] = new Students();
            sts_ar[j].setName("Liam"+i);
            i++;
        }
        return sts_ar;
    }

    public static void find_sts_name(Students[] sts_ar, String key) {
        for (Students s : sts_ar) {
            out.println(s.getName());
            out.println(key);
            out.println(s.getName().equals(key));
            if (s.getName().equals(key)) {
                out.println("So the student is " + key + " in " );
                return;
            }
        }
        out.println("Try to check your name");
        return;
    }
/**
 * 主方法哈，程序的入口嘛
 * @param args 屁用没有
 */
    public static void main(String[] args) {
        Students sts = new Students();
        sts.setEmail("14298429@qq.com");
        sts.setGender("男");
        sts.setAddress("地球");
        sts.setName("Mike");
        int temp = 4;
        Students sts1 = new Students("Liam"+temp, "19", "male", "1880020", "earth", "1429572@qq.com");
        // out.println(sts.getEmail());
        // out.println(sts.getGender());
        // out.println(sts.getAddress());
        // out.println(sts1.getEmail());
        // out.println(sts1.getGender());
        // out.println(sts1.getAddress());
        // Students.drink();
        // Students.eat();
        // Students.play();
        // Students.sleep();
        // var num = 6;
        // Students[] s = main_dev1.sts_array(num);
        // s[0] = sts;
        // s[1] = sts1;
        
        // main_dev1.find_sts_name(s, "Liam4");
        // out.println(s[3].getName());
        Teachers teac1 = new Teachers("Liam_y", "19", "male", "1880020", "earth", "1429572@qq.com");
        out.println(teac1.getAddress());
        Teacher_extd teach_ext = new Teacher_extd();
        teach_ext.drink();
        teach_ext.eat();
        Students_extd sts_ext = new Students_extd();
        sts_ext.eat();
        sts_ext.drink("juice");
        sts_ext.drink();
        //试一下多态
        Person_normal teac_ext_dynamic;
        teac_ext_dynamic = new Teacher_extd();
        teac_ext_dynamic.drink();
        teac_ext_dynamic.eat();
        teac_ext_dynamic.setName("Jack");
        out.println(teac_ext_dynamic.getName());
        //teac_ext_dynamic.teach();
        out.println("如果是1就是父类的-------"+teac_ext_dynamic.field_test);
        teach_ext.test_part();
        teach_ext.teach();
        Person_normal p = new Person_normal();
        Teacher_comb teac_comb = new Teacher_comb(p);
        teac_comb.drink();
        teac_comb.setName("Charly");
        out.println(teac_comb.getName());
    }

}
