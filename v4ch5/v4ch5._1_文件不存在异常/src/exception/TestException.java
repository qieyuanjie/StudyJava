package exception;

import java.io.File;
import java.io.FileInputStream;

public class TestException {
    public static void main(String[] args) {
        File f = new File("d:/LOL.exe");
        //试图打开文件LOL.exe，会抛出FileNotFoundException，如果不处理该异常，就会有编译错误
        //报错：
        //java: 未报告的异常错误java.io.FileNotFoundException; 必须对其进行捕获或声明以便抛出
        new FileInputStream(f);
        //常见的异常
//         ParseException 解析异常，日期字符串转换为日期对象的时候，有可能抛出的异常
//
//         OutOfIndexException 数组下标越界异常
//         OutOfMemoryError 内存不足
//         ClassCastException 类型转换异常
//         ArithmeticException 除数为零
//         NullPointerException 空指针异常
    }
}

