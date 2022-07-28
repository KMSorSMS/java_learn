package chapter5;

import static java.lang.System.*;

class Root {
    static {
        System.out.println("Root的类初始化块");
        // 第一步
    }
    {
        out.println("Root的实例初始化块");
        // 第四步出现，在实例初始化部分的第一步
    }

    public Root() {
        out.println("Root的无参数的构造器");
        //第五步，实例初始化块结束后跟上的顶级父类进行初始化
    }
}
class Mid extends Root{
    static {
        out.println("Mid的类初始化块");
        //第二步
    }
    {
        out.println("Mid的实例初始化块");
        //第六步，父类完成初始化后进行
    }
    public Mid(){
        out.println("Mid的无参数构造器");
        //第七步，Mid完成初始化
    }
    public Mid(String msg){
        //通过this调用同一类中重载的构造
        this();
        System.out.println("Mid的带参数构造器,其参数值为"+msg);
        //第八步，返回到带参数构造器后完成Mid的全部初始化
    }
}

class Leaf extends Mid{
    //第三步，子类最末端完成类的初始化接下来会走向父类的实例初始化块
    static{
        System.out.println("Leaf的类初始化块");
    }
    //第九步，子类的初始化块
    {
        System.out.println("Leaf的实例初始化块");
    }
    public Leaf(){
        //通过super调用父类中有一个字符串参数的构造器,又会走一遍初始化流程
        super("疯狂java讲义");
        System.out.println("执行Leaf的构造器");
    }
}


public class Test {
    public static void main(String[] args){
        new Leaf();
        new Leaf();
    }
}
