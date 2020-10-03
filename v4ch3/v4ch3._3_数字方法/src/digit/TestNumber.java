package digit;

public class TestNumber {
	public static void main(String[] args) {
		//java.lang.Math提供了一些常用的数学运算方法，
		//并且都是以静态方法的形式存在
		float f1 = 5.4f;
		float f2 = 5.5f;
		 //5.4四舍五入即5
        System.out.println(Math.round(f1));
        //5.5四舍五入即6
        System.out.println(Math.round(f2));
        
        //得到一个0-1之间的随机浮点数（取不到1）
        System.out.println(Math.random());
        //得到一个0-10之间的随机整数（取不到10）
        System.out.println((int)(Math.random()*10));
        
        //开方
        System.out.println(Math.sqrt(9));
        //次方(2的4次方)
        System.out.println(Math.pow(2,4));
        
        //π
        System.out.println(Math.PI);
        //自然常数e
        System.out.println(Math.E);
        
        //自然对数的计算方式。
//        借助Math的方法，把自然对数计算出来，
//        看看经过自己计算的自然对数和Math.E的区别有多大
        int n = Integer.MAX_VALUE;
        System.out.println(Math.pow(1 + 1d/n,n));//D是双精度数的后缀
        
        
        
        
	}
}
