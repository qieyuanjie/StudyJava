package date;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDate {
    public static void main(String[] args) {

        //y 代表年
        //M 代表月
        //d 代表日
        //H 代表24进制的小时
        //h 代表12进制的小时
        //m 代表分钟
        //s 代表秒
        //S 代表毫秒
//        SimpleDateFormat sdf =new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS" );
//        Date d= new Date();
//        String str = sdf.format(d);
//        System.out.println("当前时间通过 yyyy-MM-dd HH:mm:ss SSS 格式化后的输出: "+str);
//
//        SimpleDateFormat sdf1 =new SimpleDateFormat("yyyy-MM-dd" );
//        Date d1= new Date();
//        String str1 = sdf1.format(d1);
//        System.out.println("当前时间通过 yyyy-MM-dd 格式化后的输出: "+str1);
//        SimpleDateFormat sdf =new SimpleDateFormat("yyyy/MM/dd HH:mm:ss" );
//
//        String str = "2016/1/5 12:12:12";
//
//        try {
//            Date d = sdf.parse(str);
//            System.out.printf("字符串 %s 通过格式  yyyy/MM/dd HH:mm:ss %n转换为日期对象: %s",str,d.toString());
//        } catch (ParseException e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        }
        int yearStart = 1970;
        int yearEnd = 2000;
        Date[] ds = new Date[9];
        for (int i = 0; i < ds.length; i++) {

            ds[i] = getRandomTime(yearStart, yearEnd);

        }
        System.out.println("得到的随机日期数组");
        for (int i = 0; i < ds.length; i++) {
            System.out.print(ds[i] + "\t");
            if (2 == i % 3)
                System.out.println();
        }
        sortByJudge(ds);
        System.out.println("排序后的随机日期数组");
        for (int i = 0; i < ds.length; i++) {
            System.out.print(ds[i] + "\t");
            if (2 == i % 3)
                System.out.println();
        }

    }

    @NotNull
    public static String toString(Date d) {
        return toString(d, "yyyy-MM-dd HH:mm:SS");
    }

    @NotNull
    public static String toString(Date d, String format) {
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        return sdf.format(d);
    }

    private static void sortByJudge(@NotNull Date[] ds) {
        //选择法排序
        for (int j = 0; j < ds.length - 1; j++) {
            for (int i = j + 1; i < ds.length; i++) {
                String strTimeI = toString(ds[i], "HHmmss");
                String strTimeJ = toString(ds[j], "HHmmss");

                int lTimeI = Integer.parseInt(strTimeI);
                int lTimeJ = Integer.parseInt(strTimeJ);

                if (lTimeI < lTimeJ) {
                    Date temp = ds[j];
                    ds[j] = ds[i];
                    ds[i] = temp;
                }
            }
        }
    }

    @Nullable
    private static Date getRandomTime(int yearStart, int yearEnd) {
//        long second = 1000;
//        long minute = second * 60;
//        long hour = minute *60;
//        long day = hour * 60;
//        long year = day *365;
//        long year2000End = (2000-1970)*year;
//        long leapDay = (2000-1970)/4*day;
//        year2000End += leapDay;
//        long dEnd = year-1;
//        year2000End += dEnd;
//        //打表完成

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
        try {
            Date dStart = sdf.parse(String.valueOf(yearStart));//1970
            Date dEnd = sdf.parse(String.valueOf(yearEnd + 1));
            // 2001 不是 2000，要在2001的基础上减少以毫秒，才表示2000最后一刻
            long timeStart = dStart.getTime();
            long timeEnd = dEnd.getTime() - 2;//2001年-2毫秒
            long timeRandom = (long) (timeStart + Math.random() * (timeEnd - timeStart));
            return new Date(timeRandom);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }
}
