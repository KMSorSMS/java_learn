package working_area;

import java.util.Arrays;
import java.lang.Math;

public class num2rmb {
    private String[] hanArr = { "零", "一", "二", "三", "四", "五", "六", "七", "八", "九" };
    private String[] unitArr = { "十", "百", "千" };

    /**
     * 把一个浮点数分解为整数部分和小数部分字符串
     * 
     * @param num 需要被分解的浮点数
     * @return 分解出来的整数和小数部分。第一个数组元素的整数部分，第二个数组元素是小数部分
     */
    private String[] divide(double num) {
        var zheng = (long) num;
        var xiao = Math.round((num - zheng) * 100);
        return new String[] { zheng + "", String.valueOf(xiao) };
    }

    /**
     * 把一个四位的数字字符串变成汉字字符串
     * 
     * @param numStr 需要被转换的四位的数字字符串
     * @return 四位的数字字符串被转换成汉字字符串
     */
    private String toHanStr(String numStr) {
        var result = "";
        var flag = 0;
        //count用于计数，要是4个长度的字符，只有第一个是非0，是特殊情况
        var count = 0;
        int numLen = numStr.length();
        var j = 0;
        //如果第一位是0
        while((numStr.charAt(j) - 48)==0){
            j++;//保证j的索引是第一个非0数字
        }

        for (int i = j; i < numLen; i++) {
            // 把char型的数字转换成int型数字，因为他们的ASCII码值正好相差48
            // 因此把char型数字减去48得到int型数字，例如'4'被转换成4
            var num = numStr.charAt(i) - 48;
            // 如果不是最后一位数字，而且数字不是0，则需要添加单位
            if (i != numLen - 1 && num != 0) {
                result += hanArr[num] + unitArr[numLen - 2 - i];
                flag = 0;
                count++;
            }
            // 如果是最后一位并且是0的情况;或者前面紧挨着有一个0，当前还是0
            else if ((i == numLen - 1 && num == 0) || (flag == 1 && num == 0)) {
                continue;
            }

            // 否则不加单位
            else {
                result += hanArr[num];
                flag = 1;
            }
        }
        if(count==1){
            return (hanArr[numStr.charAt(j) - 48] + unitArr[numLen - 2 - j]);
        }
        return result;
    }

    public static void main(String[] args) {
        var nr = new num2rmb();
        System.out.println(Arrays.toString(nr.divide(236711125.123)));
        System.out.println(nr.toHanStr("0330"));
    }
}
