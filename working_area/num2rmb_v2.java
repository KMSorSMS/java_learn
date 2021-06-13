package working_area;
import java.util.Arrays;



public class num2rmb_v2 {
    public String to_hanzi(String[] str_all){
        //建立数组
        String[] hanunit = {"角","分"};
        String result = "";
        num2rmb nr = new num2rmb();
        //对于整数部分长度
        int len1 = str_all[0].length();
        //当只有几千几百几十几
        if(len1<=4){
            result += nr.toHanStr(str_all[0])+"元";
        }
        //当时几千几百几十几万几千几百几十几元
        else if(len1<=8){
            result += nr.toHanStr(str_all[0].substring(0,len1-4))+"万"+nr.toHanStr(str_all[0].substring(len1-4))+"元";
        }
        else{
            result += "太大了~error";
        } 
        //对于小数部分
        int len2 = str_all[1].length();
        for(int i=0;i<len2;i++){
            //将字符映射向数字，因为ASII恰好相差48
            int num = str_all[1].charAt(i)-48;
            result = result+nr.hanArr[num]+hanunit[i];
        }
        return result;
    }
    
}
