package date;

//TODO Calendar类即日历类，常用于进行“翻日历”，比如下个月的今天是多久
import org.jetbrains.annotations.NotNull;

import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;

public class TestDate {
    private static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:SS");

    public static void main(String[] args){
//        //采用单例模式获取日历对象Calendar.getInstance();
//        Calendar c = Calendar.getInstance();
//
//        //通过日历对象得到日期对象
//        Date d = c.getTime();
//
//        Date d2 = new Date(0);
//        c.setTime(d2); //把这个日历，调成日期 : 1970.1.1 08:00:00

        //add方法，在原日期上增加年/月/日
        //set方法，直接设置年/月/日
//        Calendar c = Calendar.getInstance();
//        Date now = c.getTime();
//        //当前日期
//        System.out.println("当前日期：\t"+ format(c.getTime()));
//
//        //下个月的今天
//        c.setTime(now);
//        c.add(Calendar.MONTH,1);
//        System.out.println("下个月的今天：\t" + format(c.getTime()));
//
//        //去年的今天
//        c.setTime(now);
//        c.add(Calendar.YEAR,-1);
//        System.out.println("去年的今天：\t" + format(c.getTime()));
//
//        //上个月的第三天
//        c.setTime(now);
//        c.add(Calendar.MONTH,-1);
//        c.add(Calendar.DATE,3);
//        System.out.println("上个月的第三天：\t" + format(c.getTime()));


        //找出下个月的倒数第3天是哪天
        Calendar c = Calendar.getInstance();
        Date now = c.getTime();
        //今天
        System.out.println("当前日期：\t" + format(c.getTime()));

        c.setTime(now);
        //先翻到下下个月
        c.add(Calendar.MONTH,2);
        //设置到月初
        c.set(Calendar.DATE,1);
        //再往前翻3天
        c.add(Calendar.DATE,-3);
        System.out.println("下个月的倒数第三天是：\t"+ format(c.getTime()));


    }

    @NotNull
    private static String format(Date time){
        return sdf.format(time);
    }
}