package exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

//try catch
//1.将可能抛出FileNotFoundException 文件不存在异常的代码放在try里
//2.如果文件存在，就会顺序往下执行，并且不执行catch块中的代码
//3. 如果文件不存在，try 里的代码会立即终止，程序流程会运行到对应的catch块中
//4. e.printStackTrace(); 会打印出方法的调用痕迹，如此例，会打印出异常开始于TestException，这样就便于定位和分析到底哪里出了异常
public class TestException {
    public static void main(String[] args) {
        File f = new File("d:/LOL.exe");
        //试图打开文件LOL.exe，会抛出FileNotFoundException，如果不处理该异常，就会有编译错误
        //报错：
        //java: 未报告的异常错误java.io.FileNotFoundException; 必须对其进行捕获或声明以便抛出
        //常见的异常
//         ParseException 解析异常，日期字符串转换为日期对象的时候，有可能抛出的异常
//
//         OutOfIndexException 数组下标越界异常
//         OutOfMemoryError 内存不足
//         ClassCastException 类型转换异常
//         ArithmeticException 除数为零
//         NullPointerException 空指针异常
        try {
            System.out.println("试图打开 d:/lol.exe");
            new FileInputStream(f);
            System.out.println("成功打开");

        } catch (FileNotFoundException e) {
            System.out.println("d:/lol.exe 打开失败");
            e.printStackTrace();
            //e.printStackTrace(); 会打印出方法的调用痕迹，如此例，会打印出异常开始于TestException的第26行，这样就便于定位和分析到底哪里出了异常


        }
    }
}

