package chapter5;

public class ConversionTest {
    
    public static void main(String[] args){
    var d = 13.4;
    var l = (long) d;
    System.out.println(l);
    var in = 5;
    //试图把一个数值类型的变量转化为boolean
    //编译时会提醒：不可转换的类型
    //var b = (boolean) in;
    Object obj = "Hello";
    //obj变量的编译时类型为Object，Object与String存在继承关系，可以强制类型转换
    //而且obj 变量的实际类型是String，所以运行时也可通过
    var objStr = (String) obj;
    System.out.println(objStr);
    //定义一个objPri变量，编译时类型为Object，实际类型为Integer
    Object objPri = Integer.valueOf(5);
    //objPri变量的编译时类型为Object，Objpri的运行时类型为Integer
    //Object与Interger存在继承关系
    //所以可以强制类型转换，而objPri变量的实际类型时Integer
    //而下面代码会引发ClassCastException异常
    // var str = (String) objPri;
    if (objPri instanceof String){
        var str = (String) objPri;
    }
    }
}
