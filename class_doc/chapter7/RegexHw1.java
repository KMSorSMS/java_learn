package chapter7;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexHw1 {
    public static void main(String[] args) {
        /**
         * 作业一：邮箱地址
         */
        // String content = "1429572661@qq.com";
        // String regex = "[\\w-]+@(?:[a-zA-Z]+\\.)+[a-zA-z]+";
        // Pattern pattern = Pattern.compile(regex);
        // Matcher matcher = pattern.matcher(content);
        // System.out.println("是否满足："+matcher.matches());
        /**作业2:
         * 数字正负
         */
        // String content = "1.02";
        // String regex = "^-*([1-9]+|0)(?:\\.\\d+)$";
        // System.out.println(content.matches(regex));
        /**
         * 作业3：
         * url解析
         */
        String content = "http://www.sohu.com:8080/abc/index.html";//www\\.\\w+\\.\\w+
        String regex = "^(?<protocal>[a-zA-Z]+)://(?<domain>[a-zA-Z.]+):(?<duankou>\\d+)[\\w-/]*/(?<file>[\\w.]+)$";//在[]里面的.是真的.
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(content);
        while(matcher.find()){
            System.out.println("找到protacal:"+matcher.group("protocal"));
            System.out.println("找到domain:"+matcher.group("domain"));
            System.out.println("找到duankou:"+matcher.group("duankou"));
            System.out.println("找到file："+matcher.group("file"));

        }
    } 

 
}
