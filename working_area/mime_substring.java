package working_area;

import java.util.Scanner;
import java.lang.String;

public class mime_substring {

    private String substring(int start, int end, String str) {
        // 应用一个count
        String result = "";
        int count = -1;
        for (int i = 0; i < str.length(); i++) {
            // 记录当前字符，将其转变为字符串形式
            String temp = str.charAt(i) + "";
            // 如果temp是单个字节
            if (temp.getBytes().length == 1) {
                // 记录字节数
                count++;
            }
            // 若是双个字节，即是中文
            else {
                count += 2;
            }
            // 当截取到初始位置时
            if (count >= start) {
                result += temp;
                for (int j = i + 1; j < str.length(); j++) {
                    temp = str.charAt(j) + "";
                    if (temp.getBytes().length == 1) {
                        // 记录字节数
                        count++;
                    }
                    // 若是双个字节，即是中文
                    else {
                        count += 2;
                    }
                    // 此时应该先判断超没超过索引
                    if (count >= end) {
                        return result;
                    }
                    result += temp;
                }
            }
        }
        //语法要求需要应该返回
        return result;
    }

    public static void main(String[] args) {

        System.out.println("input your string:");
        // get your string from keyboard
        // 得到输入
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            // System.out.println("I'm in there\n");
            // System.out.println("let's see what you get "+scan.next());
            String str = scan.next();
            mime_substring mime = new mime_substring();
            String sub_str = mime.substring(0, 3, str);
            System.out.println(sub_str);

        }
        scan.close();
    }
}
