package chapter5;

class Baseclass{
    public int a = 5;
}

public class Subclass extends Baseclass {
    //覆盖了父类的实例变量
    public int a = 7;
    public void accessOwner(){
        System.out.println(a);

    }
    public void accessBase(){
        //通过super来限定访问从父类继承得到的a实例变量
        System.out.println(super.a);
    }
    public static void main(String[] args){
        var sc = new Subclass();
        sc.accessOwner();//输出7
        sc.accessBase();//输出5
    }
}
