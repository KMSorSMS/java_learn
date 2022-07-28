package chapter5;

class Base {
    public Base() {
        test();
    }
    //父类的test方法，会被构造器调用
    public void test() {
        System.out.println("将被子类重写的方法");
    }
}

public class Sub extends Base{
    private String name = "og";
    {
    a = 2;
    }
    int a;
    //子类默认构造器，会先走到父类，父类又调用了test此时运行时对应的是子类的test（）所以出问题，因为name未被赋值,哪怕是明明子类里面有值也不行，
    //因为初始化顺序的原因使得到父类构造器初始化中，其实子类的成员变量还未赋值，全部为null或者0
    public Sub(){
        this.name = "og";
        System.out.print(this.a);
    }
    public void test(){
        //下面过不了编译
        // System.out.println("子类重写父类的方法，"+"其name字符串的长度"+name.length());
        System.out.println("子类重写父类的方法，"+"其name字符串的长度");
    }
    public static void main(String[] args){
        Sub s = new Sub();
        Base b = new Sub();
    }
}
