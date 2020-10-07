package character;

public class TestString {

    public static void main(String[] args) {

//		字符串即字符的组合，在Java中，字符串是一个类，所以我们见到的字符串都是对象
//		常见创建字符串手段：
//		1. 每当有一个字面值出现的时候，虚拟机就会创建一个字符串
//		2. 调用String的构造方法创建一个字符串对象
//		3. 通过+加号进行字符串拼接也会创建新的字符串对象
        String garen = "盖伦"; //字面值,虚拟机碰到字面值就会创建一个字符串对象

        String str31 = new String();//String()初始化新创建的 String对象，使其表示空字符序列。 
        String teemo = new String("提莫"); //创建了两个字符串对象,分别是 "提莫" 和 teemo
        String str0 = new String("HelloJava");//0.String(String original)初始化新创建的String对象，使其表示与参数相同的字符序列; 换句话说，新创建的字符串是参数字符串的副本。 

        char[] cs = new char[]{'崔', '斯', '特'};

        String hero = new String(cs);//  通过字符数组创建一个字符串对象

        String hero3 = garen + teemo;//  通过+加号进行字符串拼接
        char chars1[] = {'j', 'a', 'v', 'a'};
        char chars2[] = {'H', 'e', 'l', 'l', 'o', 'j', 'a', 'v', 'a'};
        String str11 = new String(chars1);//①String(char[] value)分配一个新的 String ，以便它表示当前包含在字符数组参数中的字符序列。 
        String str12 = new String(chars2, 5, 4);
		/*②String(char[] value, int offset, int count)分配一个新的 String ，其中包含字符数组参数的子阵列中的字符。
		用指定范围的字符数组赋值给str2*/


//		immutable 是指不可改变的
//		比如创建了一个字符串对象
//		String garen ="盖伦";
//		不可改变的具体含义是指：
//		不能增加长度
//		不能减少长度
//		不能插入字符
//		不能删除字符
//		不能修改字符
//		一旦创建好这个字符串，里面的内容 永远 不能改变
//
//		String 的表现就像是一个常量,是典型的不可改变的


//		length方法返回当前字符串的长度
//		可以有长度为0的字符串,即空字符串
        String name = "盖伦";
        System.out.println(name.length());

        String unknowHero = "";
        //可以有长度为0的字符串,即空字符串
        System.out.println(unknowHero.length());
    }


//	String 被修饰为final,所以是不能被继承的
    /*这里会报错，因为String不能被继承*/
//    static class MyString extends String{
//         
//    }

}
