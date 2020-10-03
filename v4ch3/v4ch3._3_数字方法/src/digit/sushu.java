/**
 * 
 */
package digit;

/**
 * @author ZYJ
 *
 */
public class sushu {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自动生成的方法存根

//      统计找出一千万以内，一共有多少质数
//
//      质数概念: 只能被1和自己整除的数
//      举例:
//      5只能被 1和5整除，所以是质数
//      8可以被2整除，所以不是质数

		final int N = 10000000;
		
		int count = 1;//默认2是素数，接下来从3开始
		boolean flag = true;//先附上初值，是素数则为true
		

		for (int i = 3; i <= N; i+=2) {
			for(int j = 3;j <= Math.sqrt(i);j+=2) {
				if(i%j==0) {
					flag = false;
					break;//结束循环
				}
				flag = true;
			}
			if(flag)count++;
		}
		System.out.println(count);
	}

}
