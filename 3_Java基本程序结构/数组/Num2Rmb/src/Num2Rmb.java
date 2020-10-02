import org.jetbrains.annotations.Contract;

import java.lang.Math;

public class Num2Rmb {
    private final String[] hanArr = {"零", "壹", "贰", "叁", "肆", "伍", "陆", "柒", "捌", "玖"};
    private final String[] unitArr = {"十", "百", "千", "万", "亿"};


    //判断是否有2至多个0相连，并且给出解决方案
    //即只输出一个“零”
    private String[] moreZero() {

        return new String[0];
    }

    /**
     * 把一个浮点数分拣成整数和小数部分
     *
     * @param num 需要被分解的浮点数
     * @return 分解出来的小数部分和小数部分，第一个数组元素是整数部分，第二个数组元素是小数部分
     */
    @Contract("_ -> new")
    private String[] divide(double num) {
        //将一个浮点数强制类型转换为long型，即得到它的整数部分
        long zheng = (long) num;
        //将浮点数减去整数部分，得到小数部分，小数部分乘以100再取整就得到两位小数
        long xiao = Math.round((num - zheng) * 100);
        //将整数和小数合并成结果字符串数组
        return new String[]{
                zheng + "",
                String.valueOf(xiao)
        };
        //上述两种方法都可以把long转换成字符串
    }

    /**
     * 把处理后的数字字符串变成汉字字符串
     *
     * @param numStr 数字字符串
     */
    private String[] toHanStr(String[] numStr) {
        String result = "";
/*
        用逗号分隔split(",");
*/
/*
        处理整数部分
        一个失败的实现，只使用foreach
        for (char strChar:numZhengArr) {
        }
        失败原因：
        此处需要对数组的最后一个元素做一些判断，使用老式数组或者是foreach+LINQ或许是个不错的办法，单独的foreach并不能实现这个目的
*/
        /*
          https://cloud.tencent.com/developer/ask/30557
           foreach (Item result in Model.Results)
           {
                //if current result is the last item in Model.Results
                //then do something in the code
           }
          老式循环怎么样？

          for (int i = 0; i < Model.Results.Count; i++) {

               if (i == Model.Results.Count - 1) {
                     // this is the last item
               }
          }
          或者使用Linq和Foreach：

          foreach (Item result in Model.Results)
          {
               if (Model.Results.IndexOf(result) == Model.Results.Count - 1) {
                       // this is the last item
               }
          }
         */
        //先处理字符串，将其分为整数和小数部分
        char[] numZhengArr = numStr[0].toCharArray();


        return numStr;
    }


}
