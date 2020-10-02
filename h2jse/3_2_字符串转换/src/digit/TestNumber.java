/**
 */
package digit;

/**
 * @author ZYJ
 *
 */
public class TestNumber {
	public static void main(String args[]) {
//		方法1： 使用String类的静态方法valueOf
//		方法2： 先把基本类型装箱为对象，然后调用对象的toString

		int i = 5;
		
		//方法1
		String str = String.valueOf(i);
		
		//方法2
		Integer it = i;
		String str2 = it.toString();
		
		//字符串转数字
		//调用Integer的静态方法parseInt
		String str1 = "999";
		int i2 = Integer.parseInt(str1);
		System.out.println(i2);
		
		//把浮点数 3.14 转换为 字符串 "3.14"
		
		float f = (float) 3.14;
		Float f1 = f;
		String str3 = f1.toString();
		String str4 = String.valueOf(f);
		System.out.println(str3 + "-" + str4);
		//再把字符串 “3.14” 转换为 浮点数 3.14
		float f2 = Float.parseFloat(str3);
		System.out.println(f2);
		
		//如果字符串是 3.1a4，转换为浮点数会得到什么？
		String str5 = "3.1a4";
		float f3 = Float.parseFloat(str5);

		//会报错，说什么输入异常
/**
 * Exception in thread "main" java.lang.NumberFormatException: For input string: "3.1a4"
	at java.base/jdk.internal.math.FloatingDecimal.readJavaFormatString(FloatingDecimal.java:2054)
	at java.base/jdk.internal.math.FloatingDecimal.parseFloat(FloatingDecimal.java:122)
	at java.base/java.lang.Float.parseFloat(Float.java:461)
	at digit.TestNumber.main(TestNumber.java:42)

 */
		
	}
}
