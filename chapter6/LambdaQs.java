package chapter6;

interface Eatable {
    void taste();
}

interface Flyable {
    void fly(String weather);
}

interface Addable {
    int add(int a, int b);
}

public class LambdaQs {
    // 调用该方法需要Eatable对象
    public void eat(Eatable e) {
        System.out.println(e);
        e.taste();
    }

    // 调用改方法需要flyable对象
    public void drive(Flyable f) {
        System.out.println("我正在驾驶：" + f);
        f.fly("[碧空如洗的晴日]");
    }

    // 调用该方法要addable对象
    public void test(Addable add) {
        System.out.println("5+3的值为：" + add.add(5, 3));
    }

    public static void main(String[] args) {
        var lq = new LambdaQs();
        // 因为lambda表达式的代码块只有一条语句，可以省略花括号
        lq.eat(() -> {
            System.out.println("Apple tastes good!");
        });
        lq.eat(() -> System.out.println("Apple tastes good!"));
        // Lambda表达式的代码块只有一条形参，可以省略圆括号，以及类型
        lq.drive(weather -> {
            System.out.println("今天的天气是：" + weather);
            System.out.println("直升机飞行平稳");
        });
        // 补全完整的格式
        lq.drive((String weather) -> {
            System.out.println("今天的天气是：" + weather);
            System.out.println("直升机飞行平稳");
        });
        // 省略了数据格式
        lq.drive((weather) -> {
            System.out.println("今天的天气是：" + weather);
            System.out.println("直升机飞行平稳");
        });
        // 代码只有一句，即使该返回值需要返回值也可以省略return关键字
        lq.test((a, b) -> a + b);
        lq.test((int a, int b) -> {
            return (a + b);
        });
    }

}
