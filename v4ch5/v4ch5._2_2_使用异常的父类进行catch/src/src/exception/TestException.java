package src.exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

//FileNotFoundException是Exception的子类，使用Exception也可以catch住FileNotFoundException

public class TestException {
    public static void main(String[] args) {
        File f = new File("d:/LOL.exe");
        try {
            System.out.println("试图打开 d:/lol.exe");
            new FileInputStream(f);
            System.out.println("成功打开");

        } catch (Exception e) {//FileNotFoundException的父类Exception
            System.out.println("d:/lol.exe 打开失败");
            e.printStackTrace();
            //e.printStackTrace(); 会打印出方法的调用痕迹，如此例，会打印出异常开始于TestException的第13行，这样就便于定位和分析到底哪里出了异常


        }
    }
}

