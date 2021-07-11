package chapter7;

import java.io.File;
import java.util.Scanner;

public class ScannerFileTest {
    public static void main(String[] args) throws Exception {

        {
            //将file对象作为scanner的构造器参数，Scanner读取文件内容

            //LARGE QUESTION:
            //对于中文因为cmd的格式是gbk

            var sc = new Scanner(new File("E:\\study_java\\working_space\\chapter7\\ScannerFileTest.java"));
            System.out.println("ScannerFileTest的文件内容如下：");
            //
            while(sc.hasNextLine()){
                System.out.println(sc.nextLine());
            }

        }
    }
}
