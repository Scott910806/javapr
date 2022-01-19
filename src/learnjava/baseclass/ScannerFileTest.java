package src.learnjava.baseclass;

import java.io.File;
import java.util.Scanner;

public class ScannerFileTest {
    // Scanner读取文件
    public static void main(String[] args) throws Exception{
        var sc = new Scanner(new File("/Users/admin/desktop/javapr/src/learnjava/baseClass/ArgsTest.java"));
        System.out.println("ScannerFileTest.java 文件内容如下：");
        while(sc.hasNextLine()){
            System.out.println(sc.nextLine());
        }
    }
}
