import java.util.Arrays;


public class ArraysTest {
    public static void main(String[] args) {
        int[] a = new int[]{3, 4, 5, 6, 7};
        int[] a2 = {3, 4, 5, 6, 7};

        //使用工具类自带的fill方法，把a3数组中所有元素都赋值为2
        int[] a3 = new int[5];
        Arrays.fill(a3, 2);

        //equals用法，当数组长度和数组内的元素一一相等时返回true
        System.out.println("a数组与a2数组是否相等：" + Arrays.equals(a, a2));

        //copyof用法，此处把新数组b生成为长度大于原数组a，为6，故用equals会返回false
        int[] b = Arrays.copyOf(a, 6);
        System.out.println("a数组与b组是否相等：" + Arrays.equals(a, b));

        //输出b数组元素查看一下
        System.out.println(b);//错误输出方法
        //正确方法，将输出[3, 4, 5, 6, 7, 0]
        System.out.println(Arrays.toString(b));//先用toString方法将b转换成字符串

        //使用工具类自带的fill方法，把b数组中第三个（包括）到第5个元素（不包括第5个）赋值为1
        Arrays.fill(b, 2, 4, 1);
        System.out.println(Arrays.toString(b));//先用toString方法将b转换成字符串

        //使用sort方法对b数组排序
        Arrays.sort(b);
        System.out.println(Arrays.toString(b));//先用toString方法将b转换成字符串
    }

}
