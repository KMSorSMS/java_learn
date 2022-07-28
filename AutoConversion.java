public class AutoConversion
{
    public static void main(String[] args) {
        int a = 6;
        //int 类型可以自动转换成float类型
        float f = a;
        //下面将输出6.0
        System.out.println(f);
        //定义一个byte类型的整数变量
        byte b = 9;
        //下面代码将出错，byte类型不能自动类型转换为char类型
        //char c = b;
        //byte类型可以自动类型转换为double
        double d = b;
        //下面将输出9.0
        System.out.println(d);
        //实验byte能否自动类型转换为int
        int e = b;
        System.out.println(e);
    }
}