package chapter6;

interface Tes {
    void out();

}
interface Tes1{
    default void dfunc(String s){
        System.out.println("这是带参数的interface里面的default方法"+s);
    }
    void out();


}

public class TestCase
{
public void pr(Tes t){
    t.out();
}
public void pr1(Tes1 t){
    t.out();
    t.dfunc("This is life,fuck it!");
}
public static void main(String[] args){
    TestCase testc = new TestCase();
    testc.pr(()->System.out.println("这是用testcase的方法建的实现Tes"));
    var t1 = (Tes) ()->System.out.println("这是直接建的tes实例");
    t1.out();
    testc.pr1(()->System.out.println("这是用pr1方法调用实现Tes1interface"));
    var t2 = (Tes1) ()->{System.out.println("这是直接建的tes1的实例");};
    t2.out();
    t2.dfunc("Hey,look at you!");
}
}

