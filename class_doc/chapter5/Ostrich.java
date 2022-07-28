package chapter5;

public class Ostrich extends Bird {
    //重写bird类的fly方法
    public void fly()
    {
        System.out.println("我只能在地上跑");
    }
    public static void main(String[] args){
        //创建Ostrich对象
        var os = new Ostrich();
        os.fly();
        os.callOverrideMethod();
    }
    public void callOverrideMethod()
    {
        //在子类中通过super显式调用父类被覆盖的实例方法
        super.fly();
    }
}
