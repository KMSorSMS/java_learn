package working_area;

import java.util.Arrays;
import java.lang.Math;

public class num2rmb {
    private String[] hanArr = { "��", "һ", "��", "��", "��", "��", "��", "��", "��", "��" };
    private String[] unitArr = { "ʮ", "��", "ǧ" };

    /**
     * ��һ���������ֽ�Ϊ�������ֺ�С�������ַ���
     * 
     * @param num ��Ҫ���ֽ�ĸ�����
     * @return �ֽ������������С�����֡���һ������Ԫ�ص��������֣��ڶ�������Ԫ����С������
     */
    private String[] divide(double num) {
        var zheng = (long) num;
        var xiao = Math.round((num - zheng) * 100);
        return new String[] { zheng + "", String.valueOf(xiao) };
    }

    /**
     * ��һ����λ�������ַ�����ɺ����ַ���
     * 
     * @param numStr ��Ҫ��ת������λ�������ַ���
     * @return ��λ�������ַ�����ת���ɺ����ַ���
     */
    private String toHanStr(String numStr) {
        var result = "";
        var flag = 0;
        //count���ڼ�����Ҫ��4�����ȵ��ַ���ֻ�е�һ���Ƿ�0�����������
        var count = 0;
        int numLen = numStr.length();
        var j = 0;
        //�����һλ��0
        while((numStr.charAt(j) - 48)==0){
            j++;//��֤j�������ǵ�һ����0����
        }

        for (int i = j; i < numLen; i++) {
            // ��char�͵�����ת����int�����֣���Ϊ���ǵ�ASCII��ֵ�������48
            // ��˰�char�����ּ�ȥ48�õ�int�����֣�����'4'��ת����4
            var num = numStr.charAt(i) - 48;
            // ����������һλ���֣��������ֲ���0������Ҫ��ӵ�λ
            if (i != numLen - 1 && num != 0) {
                result += hanArr[num] + unitArr[numLen - 2 - i];
                flag = 0;
                count++;
            }
            // ��������һλ������0�����;����ǰ���������һ��0����ǰ����0
            else if ((i == numLen - 1 && num == 0) || (flag == 1 && num == 0)) {
                continue;
            }

            // ���򲻼ӵ�λ
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
