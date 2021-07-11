package chapter6;

/**
 * 创建接口
 */
interface Product
{
    double getPrice();
    String getName();
}


public class Anonymous {
    public void test(Product p){
        System.out.println("购买了一个"+p.getName()+",花掉了"+p.getPrice());
    }
    public static void main(String[] args)
    {
        var ta = new Anonymous();
        ta.test(new Product(){
            public double getPrice(){
                return 657.8;
            }
            public String getName(){
                return "AGP 显卡";
            }
        });
    }
}
