package chapter6;

public class EnumClass {
    // switch语句里面的表达式可以是枚举值
    public void judge(SeasonEnum s) {
        switch (s) {
            case SPRING:
                System.out.println("春天");
                break;
            case SUMMER:
                System.out.println("夏天");
                break;
            case FALL:
                System.out.println("秋天");
                break;
            case WINTER:
                System.out.println("冬天");
                break;
        }
    }
    public static void main(String[] args){
        //枚举类默认有一个values方法，返回该枚举类的所有实例
        for (var s : SeasonEnum.values()){
            System.out.println(s);
        }
        // 使用枚举实例时，可以通过Enumclass.variable形式来访问
        new EnumClass().judge(SeasonEnum.SPRING);
    }
}
