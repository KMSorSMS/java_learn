public class VarTest {
    //定义一个name实例变量
    private String name = "yzw";
    //定义一个price类变量
    private static  double price = 78.0;
    //主方法，程序入口
    public static void main(String[] args){
        //方法里的局部变量,局部变量覆盖成员变量
        var price = 65;
        //直接访问price变量，将输出price局部变量的值：65
        System.out.println(price);
        //使用类名作为price变量的限定，
        //将输出price类变量的值：78.0
        System.out.println(VarTest.price);
        //运行info方法
        new VarTest().info();
        
    }
    public void info()
    {
        //方法里面的局部变量，局部变量覆盖成员变量
        var name = "pg";
        //直接访问name变量，将输出name的局部变量值：pg
        System.out.println(name);
        //使用this来作为name变量的限定（因为是实例的成员变量嘛
        //将输出：yzw
        System.out.println(this.name);
    }
}
