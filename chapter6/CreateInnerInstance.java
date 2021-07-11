package chapter6;

class Out
{
    //define an inner class without restriction notes
    //即是包访问权限
    class In
    {
        public In(String msg)
        {
            System.out.println(msg);
        }
    }
}


public class CreateInnerInstance {
    public static void main(String[] args){
        Out.In in = new Out().new In("测试信息");
    }
}
