package hw_6_teacher;
/**
 * Description:
 * 网站：<a href="http://www.baidu.com">疯狂Java联盟</a><br>
 * Copyright (c),2021-2022,Yzw<br>
 * This program is my hw in chapter 6. <br>
 * Program Name:Teachers class
 * Date:2021.6.12
 * @author yzw
 * @version 1.0
 */

public class Teachers {
    /**
     * 这里是成员变量喔
     */
    private String name;
    private String age;
    private String gender;
    private String phone;
    private String address;
    private String email;

    /**
     * 
     * @param name 老师姓名喔
     * @param age 老师年龄嘛
     * @param gender 老师性别呢
     * @param phone1 老师手机哈
     * @param address1 老师地址哟
     * @param email1 老师的邮箱哦
     */
    public Teachers(String name, String age, String gender, String phone1, String address1, String email1) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        phone = phone1;
        email = email1;
        address = address1;
    }

    /**
     * 默认不加参数的初始化重载的
     * 不加br换行否<br>加了br是否换行
     */
    public Teachers() {

    }
    /**
     * 
     * @param name 名字，懂？
     */
    public void setName(String name) {
        this.name = name;
    }
/**
 * 
 * @return 还名字回去，懂？<br>继续写的
 * --------------------
 * 又补充的
 */
    public String getName() {
        return name;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getAge() {
        return age;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPhone() {
        return phone;
    }

}
