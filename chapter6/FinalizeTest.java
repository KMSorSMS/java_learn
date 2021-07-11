package chapter6;


public class FinalizeTest {
    private static FinalizeTest f = null;
    public void info(){
        System.out.println("测试资源清理情况的finalize方法");
    }
    public static void main(String[] args){
        //创建finalize对象立即进入可恢复状态
        new FinalizeTest();
        //通知系统进行资源回收
        System.gc();
        //强制垃圾回收机制调用可恢复对象的finalize方法
        // Runtime.getRuntime().runFinalization();
        System.runFinalization();
        f.info();
    }
    public void finalize(){
        f = this;
    }
}
