package chapter6;

public class GenderTest {
    public static void main(String[] args){ 
    //通过Enum的valueof（）方法来获取指定的枚举类的枚举值
    Gender g = Enum.valueOf(Gender.class, "FEMALE");
    // g.name = "女";
    // System.out.println(g+"代表"+g.name);
    g.setName("男");
    g.setName("女");
    System.out.println(g+"代表"+g.getName());
    }

}
