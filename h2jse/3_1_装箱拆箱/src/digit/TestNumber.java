package digit;
public class TestNumber{
	public static void main(String[] args) {
		int i = 5;
		//把一个基本类型的变量转换为Integer对象
		Integer it = new Integer(i);
		//把一个Integer对象转换为基本类型int
		int i2 = it.intValue();
		System.out.println(i);
		System.out.println(i2);
		
		//Integer是抽象类Number的子类,打印true
		System.out.println(it instanceof Number);
		
		//基本类型转换成封装类型
		Integer it1 = new Integer(i);
		
		//封装类型转换成基本类型
		int i3 = it1.intValue();
		
		//不需要调用构造方法，通过=符号自动把 基本类型 转换为 类类型 就叫装箱
		//基本类型转换成封装类型
		Integer it2 = new Integer(i);
		
		//自动转换就叫装箱
        Integer it3 = i;
        
        //封装类型转换成基本类型
        int i4 = it.intValue();
        
        //自动转换就叫拆箱
        int i5 = it;
		
        //int的最大值可以通过其对应的封装类Integer.MAX_VALUE获取
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        
        // 对byte,short,float,double进行自动拆箱和自动装箱
        byte b = 1;
        Byte b1 = b;
        byte b2 = b1;
        
        short s = 1;
        Short s1 = s;
        short s2 = s1;
        
        float f = 0;
        Float f1 = f;
        float f2 = f1;
        
        double d = 1.222;
        Double d1 = d;
        double d2 = d1;
        
        //byte和Integer之间能否进行自动拆箱和自动装箱
//        Integer it4 = b;//不能把byte直接自动装箱成Integer
////        byte b3 = it3;//也不能把Integer自动拆箱成 byte
        //都不能
       
        
        System.out.println(b1.MAX_VALUE);
	}
}