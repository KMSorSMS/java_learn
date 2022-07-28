package chapter7;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// import java.util.Scanner;

// import javax.swing.text.AbstractDocument.Content;

public class RegexHwBook {
    public static void main(String[] args) {
        // String content = "ABCDEFG";
        // String regstr = "CD";
        // StringBuffer sb_str = new StringBuffer();
        // StringBuffer sb_num = new StringBuffer();
        String content = "A1B2C3D4E5F6G7H8I9";
        String regex = "[a-zA-Z]";
        String[] content1 = content.split(regex);
        System.out.println(Arrays.toString(content1));
        int[] num = new int[content1.length];
        for(int i = 1;i<content1.length;i++){
            num[i] = Integer.valueOf(content1[i]);
        }
        System.out.println(Arrays.toString(num));
        // String regex = "(?<chara>[a-zA-Z])(?<num>\\d)";
        // Pattern pattern = Pattern.compile(regex);
        // Matcher mathcer = pattern.matcher(content);
        // while(mathcer.find()){
        //     sb_str.append(mathcer.group("chara"));
        //     sb_num.append(mathcer.group("num"));
        // }
        // String[] str;
        // str = new String[sb_str.length()];

        // content = content.replaceAll(regstr, "");
        // System.out.println(content);
        // Scanner sc = new Scanner(System.in);
        // String name = sc.next();
        // System.out.println(name);

    }

}
