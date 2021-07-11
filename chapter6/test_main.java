package chapter6;

import static java.lang.System.*;

public class test_main {
    public static void main(String[] args) {
        // var c1 = CacheImmutable.valueof("hello");
        // var c2 = CacheImmutable.valueof("hello");

        // //因为引用的是同一处的地址
        // System.out.println(c1==c2);
        String c21 = "hello";
        String c22 = "hel" + "lo";
        String c11 = "hel";
        String c12 = c11 + "lo";
        String c31 = c22;
        Track p = new Track();
        Object q = p;
        out.println(c31 == c22);
        out.println(c31 == c21);
        out.println(c21 == c22);
        out.println(c21 == c12);
        out.println(p==q);
        // // c21="kdjfk";
        // c22="nihao";
        // int a=3;
        // final Integer b = 8;
        // out.println("b的值是"+b);
        // Integer c = b;
        // out.println("c的值是："+c);
        // b = 9;
        // a=5;
        // out.println("b的值是："+b+" c的值是："+c);
        // System.out.println(a);
        // System.out.println(c22);
        // }
    }
}
