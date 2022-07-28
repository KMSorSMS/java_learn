package chapter5;

import java.util.Set;

public class Studenthw {
    private String name;
    private int age;
    private String gender;
    private String phone;
    private String address;
    private String email;
    private static Studenthw[] contacts;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return this.gender;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPhone() {
        return this.phone;

    }
    public void setAddress(String address){
        this.address = address;
    }
    public String getAddress(){
        return this.address;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public String getEmail(){
        return this.email;
    }
    //number是指这个通讯录要多大
    public static void SetContac(int number){
        Studenthw[] conTemp = new Studenthw[number];
        if(contacts!=null){
            //如果新建的通讯录比原有的大
            if(contacts.length<number)
            {
                System.arraycopy(contacts, 0, conTemp, 0, contacts.length);
            }
            //不然就不用去做更改
            else{
                return;
            }
        }
        Studenthw.contacts = conTemp;
    }
    //index是指通讯录上第几个人
    public static void Addcontac(Studenthw stu,int index){
        if(Studenthw.contacts.length<index){
            SetContac(index);
        }
        if(Studenthw.contacts!=null){
            contacts[index-1] = stu;
        }
    }
    public static String Search(String key){
        for(Studenthw stu:contacts){
            if(stu.name.equals(key)||stu.email.equals(key)||stu.address.equals(key)){
                System.out.println("找到该学生，他的电话号码是："+stu.phone);
                return stu.phone;
            }
        }
        System.out.println("检查是否有拼写错误，没找到学生");
        return "";
    }

    public static void main(String[] args){
        Studenthw stu1 = new Studenthw();
        stu1.setAddress("dxc");
        stu1.setEmail("20011124@qq.com");
        stu1.setName("wangcai");
        stu1.setPhone("789012345678");
        Studenthw stu2 = new Studenthw();
        stu2.setAddress("spb");
        stu2.setEmail("0913@qq.com");
        stu2.setName("yuanda"); 
        stu2.setPhone("6789054321");
        Studenthw stu3 = new Studenthw();
        stu3.setAddress("bnq");
        stu3.setEmail("1314233@qq.com");
        stu3.setName("wm");
        stu3.setPhone("0987654321");
        Studenthw stu4 = new Studenthw();
        stu4.setAddress("qzx");
        stu4.setEmail("12369@qq.com");
        stu4.setName("yy");
        stu4.setPhone("1234567890");     
        Studenthw.SetContac(3);
        Studenthw.Addcontac(stu1, 1);
        Studenthw.Addcontac(stu2, 2);
        Studenthw.Addcontac(stu3, 3);
        Studenthw.Search("wm");
        Studenthw.Search("12369@qq.com");
        Studenthw.Search("0913@qq.com");
        Studenthw.Addcontac(stu4, 4);
        Studenthw.Search("12369@qq.com");


    }
}
