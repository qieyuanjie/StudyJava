package character;
public class TestString extends MyStringBuffer{
    //StringBuffer是可变长的字符串
    public static void main(String[] args){
        //append追加
        //delete 删除
        //insert 插入
        //reverse 反转
//        String str1 = "let there ";
//        //根据str1创建一个StringBuffer对象
//        StringBuffer sb = new StringBuffer(str1);
//        sb.append("be light");
//        System.out.println(sb);
//
//        sb.delete(4,10);//删除下标4-10之间的字符,基0
//        System.out.println(sb);
//        sb.insert(4,"there ");//在位置4这里插入"there",基0
//        System.out.println(sb);
//        sb.reverse();//反转
//        System.out.println(sb);
//
//        System.out.println(str1);//str1中还是let there 没有后半段
        //为什么StringBuffer可以变长？
        //和String内部是一个字符数组一样，StringBuffer也维护了一个字符数组。 但是，这个字符数组，留有冗余长度
        //比如说new StringBuffer("the")，其内部的字符数组的长度，是19，而不是3，这样调用插入和追加，在现成的数组的基础上就可以完成了。
        //如果追加的长度超过了19，就会分配一个新的数组，长度比原来多一些，把原来的数据复制到新的数组中，看上去 数组长度就变长了 参考MyStringBuffer
        //length: “the”的长度 3
        //capacity: 分配的总空间 19
        //
        //注： 19这个数量，不同的JDK数量是不一样的

//        String str1 = "the";
//
//        StringBuffer sb = new StringBuffer(str1);
//
//        System.out.println(sb.length()); //内容长度
//
//        System.out.println(sb.capacity());//总空间

        //String与StringBuffer的性能区别?
        //
        //生成10位长度的随机字符串
        //然后,先使用String的+,连接10000个随机字符串,计算消耗的时间
        //然后,再使用StringBuffer连接10000个随机字符串,计算消耗的时间
        //
        //提示: 使用System.currentTimeMillis() 获取当前时间(毫秒)
        final int Total =10000;
        final int num = 33;
//        String str1 = "the";
        String str1 = getRandomString(num);
        long t1 = System.currentTimeMillis();
//        for(int i = 0;i<Total;i++){
//            str1 += getRandomString(num);
//        }
        long t2 = System.currentTimeMillis();
        System.out.println(t2-t1);

        StringBuffer sb = new StringBuffer(str1);
        t1 = System.currentTimeMillis();
        for(int i = 0;i<Total;i++){
            sb.append(getRandomString(num));
        }
        t2 = System.currentTimeMillis();
        System.out.println(t2-t1);


        MyStringBuffer msb = new MyStringBuffer(str1);
        t1 = System.currentTimeMillis();
        for(int i = 0;i<Total;i++){
            msb.append(getRandomString(num));
        }
        t2 = System.currentTimeMillis();
        System.out.println(t2-t1);

    }
}
