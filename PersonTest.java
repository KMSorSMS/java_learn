public class PersonTest {
    public static void main(String[] args){
        var p = new Person();
        //因为age成员变量已被隐藏，所以下面语句将出现编译错误
        //p.age = 10;
        //程序不会修改p的age成员变量
        p.setAge(1000);
        //因为p的age成员变量也必须通过其对应的getter方法
        //因为上面从未成功设置p的age成员变量，故此处输出0
        System.out.println("未能设置age成员变量时"+p.getAge());
        //成功修改p的age成员变量，故此处输出30
        p.setAge(30);
        System.out.println("成功设置age成员变量后："+p.getAge());
        
    }
}
