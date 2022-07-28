package chapter5;

public class InstanceofTest {
    public static void main(String[] args){
        //声明hello时使用Object类,则hello的编译类型是Object
        //Object是所有类的父类，但hello变量的实际类型是String 
        Object hello = "Hello";
        //String和Object属于继承关系，可以进行instanceof运算，返回true
        java.lang.System.out.println("字符串是否是Object类的实例："+(hello instanceof Object));
        System.out.println("字符串是否是String类的实例："+(hello instanceof String));
        //Math与Object类存在继承关系，可以进行instanceof运算。返回false
        System.out.println("字符串是否是Math的实例："+(hello instanceof Math));
        //String实现了Comparable接口，所以返回false
        System.out.println("字符串是否是Comparable接口的实例："+(hello instanceof Comparable));
        var a = "hello";
        //String类和Math没有继承关系所以编译无法通过
        // System.out.println(""+(a instanceof Math));
    }
}
