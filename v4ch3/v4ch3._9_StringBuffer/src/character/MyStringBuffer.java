package character;

public class MyStringBuffer extends getRandomString implements IStringBuffer {
    int capacity = 16;//buffer容量
    int length = 0;//当前字符串长度
    char[] value;

    //value：用于存放字符数组
    //capacity： 容量
    //无参构造方法： 根据容量初始化value
    public MyStringBuffer() {
        value = new char[capacity];
    }

    //带参构造函数
    public MyStringBuffer(String str) {
        this();
        if (null == str) return;

        value = new char[capacity];//此时容量capacity=16

        while (capacity < str.length()) {//如果value不够长就一直扩容
            capacity = value.length * 2;//扩容
            value = new char[capacity];//new一个长度是两倍的char数组value
            //value指向新的数组长度16->2*16->2*(2*16)
            //当str的长度过于高的时候，我想可能遭遇到一些糟糕的情况
        }
        //此时capacity一定大于等于str的长度，可能是默认容量16,或者16的倍数
        System.arraycopy(str.toCharArray(), 0, value, 0, str.length());

        //记录长度
        length = value.length;
    }

    @Override
    public void reverse() {
        for (int i = 0; i < length / 2; i++) {
            char temp = value[i];
            value[i] = value[length - i - 1];
            value[length - i - 1] = temp;
        }
    } //反转

    @Override
    public int length() {
        return length;
    } //返回长度

    @Override
    public void insert(int pos, String b) {
        //判断边界条件
        //插入位置是否合法，插入的字符串是否为空
        if (pos < 0)
            return;
        if (pos > length)
            return;
        if (null == b)
            return;
        //判断是否要扩容
        if (length + b.length() > capacity) {
            //扩增容量
            capacity = (int) ((length + b.length()) * 1.5f);//明显的，这个值一定是大于length+b.length()的
            char[] newValue = new char[capacity];
            //将旧的value给拷贝到新的newValue中
            System.arraycopy(value, 0, newValue, 0, length);
            value = newValue;
        }
        //插入字符串
        char[] cs = b.toCharArray();

        //将cs一分为二，先把第二部分的已经存在的数据后移
        System.arraycopy(value, pos, value, pos + cs.length, length - pos);
        //把要插入的数据插入到指定位置
        System.arraycopy(cs, 0, value, pos, cs.length);

        //修改length
        length = length + cs.length;

    } //指定位置插入字符串

    //参数是字符的insert方法，通过调用insert(int, String) 也就实现了。
    @Override
    public void insert(int pos, char b) {
        insert(pos, String.valueOf(b));
    } //指定位置插入字符

    //追加，就是在最后位置插入。 所以不需要单独开发方法，直接调用insert方法，就能达到最后位置插入的效果
    @Override
    public void append(String str) {
        insert(length, str);

    }//追加字符串

    @Override
    public void append(char c) {
        insert(length, String.valueOf(c));
    }  //追加字符

    @Override
    public void delete(int start, int end) {
        //边界条件判断
        if (start < 0)
            return;
        if (start > length)
            return;
        if (end < 0)
            return;
        if (end > length)
            return;
        if (start >= end)
            return;

        System.arraycopy(value, end, value, start, length - end);
        length = end - start;

    } //从开始位置删除结束位置-1


    @Override
    public void delete(int start) {
        delete(start, length);
    }//从开始位置删除剩下的

    public String toString() {
        char[] realValue = new char[length];

        System.arraycopy(value, 0, realValue, 0, length);

        return new String(realValue);
    }

    public static void main(String[] args) {
        MyStringBuffer sb = new MyStringBuffer("there light");

//        sb.reverse();
//        System.out.println(sb);
        System.out.println(sb);
        sb.insert(0, "let ");
        System.out.println(sb);

        sb.insert(10, "be ");
        System.out.println(sb);
        sb.insert(0, "God Say:");
        System.out.println(sb);
        sb.append("!");
        System.out.println(sb);
        sb.append('?');
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);

        //二次反转恢复正常
        sb.reverse();
        System.out.println(sb);

        sb.delete(0, 4);
        System.out.println(sb);
        sb.delete(4);
        System.out.println(sb);
    }
}
