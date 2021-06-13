package hw_6_students;

import static java.lang.System.*;
/**
 * Description:
 * 网站：<a href="http://www.baidu.com">疯狂Java联盟</a><br>
 * Copyright (c),2021-2022,Yzw<br>
 * This program is my hw in chapter 6. <br>
 * Program Name:Students class
 * Date:2021.6.12
 * @author yzw
 * @version 1.0
 */

public class Students {

    private String name;
    private String age;
    private String gender;
    private String phone;
    private String address;
    private String email;

    public Students(String name, String age, String gender, String phone1, String address1, String email1) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        phone = phone1;
        email = email1;
        address = address1;
    }

    public Students() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getAge() {
        return age;
    }

    public void setGender(String gender1) {
        gender = gender1;
    }

    public String getGender() {
        return gender;
    }

    public void setEmail(String email1) {
        email = email1;
    }

    public String getEmail() {
        return email;
    }

    public void setPhone(String phone1) {
        phone = phone1;
    }

    public String getPhone() {
        return phone;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }
    
    /**
     * 关于吃糠的方法嘻嘻
     */
    public static void eat() {
        out.println("The studen is eating now!");
    }
    /**
     * 喝水的方法
     */
    public static void drink(){
        out.println("The student is drinking now!");
    }
    
    public static void play(){
        out.println("The student is having fun now!");
    }
    public static void sleep(){
        out.println("The student is asleep,be quiet please~");
    }

}
