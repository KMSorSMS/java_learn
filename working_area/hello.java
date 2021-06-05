package working_area;
public class hello
{
    public static void main(String[] args)
    {
        byte a = 56;//byteÊÇ8bit¼´1×Ö½Ú£»2^7-1(127);
        var b = 23;
        char achar = 'a';
        char enterChar = '\r';
        String ano_char = "\u9999";
        char ch = '\u9999';
        System.out.println(ch);
        System.out.println(achar);
        System.out.println(b);
        System.out.println(ano_char+achar);
        System.out.println(enterChar+ch);
        System.out.println("Hello World!");
        System.out.println(a);
    }
}