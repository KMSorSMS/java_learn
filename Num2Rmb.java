import java.util.Arrays;
import java.math.*;

/**
 * 原始问题有：
 * 1、两个零挨在一起
 * 2、末尾\最高位是0
 * 3、当是几万几亿时没有处理
 */

public class Num2Rmb {
    private String[] hanArr = { "零", "壹", "二", "叁", "四", "伍", "六", "七", "八", "九" };
    private String[] unitArr = { "十", "百", "千" };

    /**
     * 把一个浮点数分解成整数部分和小数部分字符串
     * 
     * @param num 需要被分解的浮点数
     * @return 分解出来的整数部分和小数部分。第一个数组元素是整数部分，第二个数组元素是小数部分
     */
    private String[] divide(double num) {
        // 将一个浮点数强制类型转换为long型，即得到它的整数部分
        long zheng = (long) num;
        // 浮点数减去整数部分，得到小数部分，小数部分乘以100后再取整得到2位小数
        long xiao = Math.round((num - zheng) * 100);
        return new String[] { zheng + "", String.valueOf(xiao) };
    }

    /**
     * 把一个四位的数字字符串变成汉字字符串
     * 
     * @param num 需要被分解的浮点数
     * @return 四位的数字字符串被转换成汉字字符串
     */
    private String toHanStr(String numStr) {
        String result = "";
        int numLen = numStr.length();
        // 首项如果是0就跳过第一个,有几个0跳过几个
        int num = numStr.charAt(0) - 48;
        int i = 0;
        if (num == 0) {
            i = 1;
            // 如果前两个都为0就跳到第三个开始
            if (numLen - 1 >= 1 && numStr.charAt(1)-48 == 0) {
                i = 2;
                // 如果前三个都为0就跳到第四个开始
                if (numLen - 1 >= 2 && numStr.charAt(2)-48 == 0) {
                    i = 3;
                }
            }

        }
        /**
         * 这样是不对的，因为高位是第一个字符
         */
        // //看首项的字符是不是0,是0的话直接把长度剪掉
        // int num = numStr.charAt(0)-48;
        // if(num==0){numLen--;}
        // 看末项是不是0，是0的时候注意要是前面全是0就给他抹了,并做下标记
        char flag = 0;
        num = numStr.charAt(numLen - 1) - 48;
        if (num == 0) {
            // 常规只有0为末尾
            flag = 1;
            /// 如果0末尾前面还有连着的,那么就不会要0了,标记flag为2
            if ((numStr.charAt(numLen - 2) - 48) == 0) {
                flag++;
            }
        }
        // 依次遍历数字字符串的每一位数字,注意i的初始化被用到了先
        for (; i < numLen; i++) {
            // 把char型数字转换成int类型的数字，因为它们的ASCII码值正好相差48
            // 因此把char类型的数字减去48得到int类型的数字，例如'4'被转换成4
            num = numStr.charAt(i) - 48;
            // 如果不是最后一位数字，而且数字不是0，则需要添加单位（千、百、十）
            if (i != numLen - 1 && num != 0) {
                result += hanArr[num] + unitArr[numLen - 2 - i];
            }
            // 否则不需要单位
            else {
                // 如果是0不为末尾
                if (flag == 0) {
                    result += hanArr[num];
                    // 标志有0，且这里说明不会是第一位则看下一位是不是0就可判断连续
                    // 如果连续就把下一位跳过
                    if (num == 0 && (numStr.charAt(i + 1) - 48) == 0) {
                        i++;
                    }

                }
                // 如果0是末尾且前面不是0，说明类似6010或者6120这种，不可能有连续,那么除零以外的其他东西都正常处理忽略0
                else if (flag == 1 && i != numLen - 1) {
                    result += hanArr[num];
                }
                // 如果0是末尾且前面是0，那么就是6100或6000或0500或400这种，那么所有为0的内容都不处理
                else if (flag == 2 && num != 0) {
                    result += hanArr[num];
                }

                /**
                 * 换思路，对于开头和结尾有0的单独处理了来
                 */
                // //看是否有重复，有一个0就加一，不连续就清零
                // flag = (num == 0)?++flag:0;
                // //如果没有0连续就直接加，但是注意最后一位是0的情况
                // if(flag<=1&&i!=num-1){
                // result+=hanArr[num];
                // }
                // //为2说明有连续但是不保证最后一位到了所以还要判断
                // else if(flag==2&&i!=num-1){
                // continue;
                // }
                // //此时一定是最后一位为0的情况
                // else if(flag==3){

                // }
                // //特判最后一位为0的情况

            }
        }
        return result;
    }

    /**
     * 对于是几万几亿的情况处理
     * 
     * @param numstr
     * @return
     */
    private String Combine(String numStr) {
        String result1 = "";
        String result2 = "";
        String result3 = "";
        String result = "";
        int numLen = numStr.length();
        // 如果长度超过4，将其截断为4个4个的小节
        // 在千的范畴内
        if (numLen <= 4) {
            result = toHanStr(numStr);
        }
        // 在万的范畴内
        else if (numLen <= 8) {
            // 1是存放万的部分
            // 先要补齐到8位
            int i = 0;
            i += 8 - numLen;
            // j是对应移过去的万位
            int j = 0;
            for (; i < 4; i++, j++) {
                result1 += numStr.charAt(j);
            }
            // 出万位结果
            result1 = toHanStr(result1);
            for (; i < numLen; i++, j++) {
                result2 += numStr.charAt(j);
            }
            // 出千结果
            result2 = toHanStr(result2);
            // 合并部分
            result = result1 + "万" + result2;
        }
        // 在亿的范畴内
        else if (numLen <= 12) {
            // 1存放亿的部分
            int i = 0;
            i += 12 - numLen;
            // j是移动取numStr的项
            int j = 0;
            for (; i < 4; j++, i++) {
                result1 += numStr.charAt(j);
            }
            // 出亿的结果
            result1 = toHanStr(result1);
            // 处理万位
            for (; i < 8; i++, j++) {
                result2 += numStr.charAt(j);
            }
            // 出万位的结果
            result2 = toHanStr(result2);
            // 处理千位
            for (; i < numLen; i++, j++) {
                result3 += numStr.charAt(j);
            }
            // 出千位结果
            result3 = toHanStr(result3);
            // 合并出结果
            result = result1 + "亿" + result2 + "万" + result3;
        }
        return result;
    }

    // 测试
    public static void main(String[] args) {
        Num2Rmb nr = new Num2Rmb();
        // 测试把一个浮点数分解成整数部分和小数部分
        System.out.println(Arrays.toString(nr.divide(236711125.123)));
        // 测试把一个四位的数字字符串变成汉字字符串
        System.out.println(nr.Combine("003"));
        System.out.println(nr.toHanStr("0050"));
        System.out.println(nr.toHanStr("0002"));
        System.out.println(nr.toHanStr("400"));
        System.out.println(nr.toHanStr("1982"));
        System.out.println(nr.Combine("0441982"));
        System.out.println(nr.Combine("14564523452"));
        System.out.println(nr.Combine("614564523452"));
        System.out.println(nr.Combine("314064003452"));

        // System.out.println(nr.toHanStr("0441312"));

    }
}
