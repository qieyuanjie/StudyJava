public class ArrayTest {
    /*
        Java支持两种语法定义数组
        type[] arrayName;
        type arrayName[];
        其中第一章格式具有更好的语义与可读性，建议不要再使用第二种定义方法了

     */
    public static void main(String[] args) {
        //定义一个int类型的变量，变量名为intArr
        int[] intArr;

        //静态初始化方法,这种方法只指定了数组元素的初始值，而没有给出数组长度
        intArr = new int[]{5, 6, 7, 8, 20};

        //定义一个object数组类型变量，并进行静态初始化
        //String是object类型的子类，即字符串是一种特殊的object实例
        Object[] objarr;
        objarr = new String[]{"Java", "Hello"};
        Object[] objarr2;
        objarr2 = new Object[]{"Java", "hello"};


        //更简化的语法格式
        int[] a = {5, 6, 7, 9};


        //动态初始化方法，只要指定数组长度，系统会自动为每个数组元素指定初始值
        int[] price = new int[5];
        Object[] books = new String[4];
        Object[] books2 = new Object[4];

    }
}
