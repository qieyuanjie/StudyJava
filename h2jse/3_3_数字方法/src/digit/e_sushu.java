/**
 * //		埃拉托色尼选筛法(the Sieve of Eratosthenes)简称埃氏筛法，
//		是古希腊数学家埃拉托色尼(Eratosthenes 274B.C.～194B.C.)提出的一种筛选法。
//		是针对自然数列中的自然数而实施的，用于求一定范围内的质数，
//
//		它的容斥原理之完备性条件是p=H~。
//		基本原理：
//		筛素数的基本方法是用来筛选出一定范围内的素数素数筛法的基本原理，
//		利用的是素数p只有1和p
//		这两个约数，并且一个数的约数一定不大于本身，素数筛法的过程：
//		把从1开始的、某一范围内的正整数从小到大顺序排列，
//		1不是素数，首先把它筛掉。
//		剩下的数中选择最小的数是素数，然后去掉它的倍数。
//		依次类推，直到筛子为空时结束。
//		求解用途：
//		素数筛法经常作为一道题的一部分用来打一定范围内素数表，
//		————————————————
//		版权声明：本文为CSDN博主「取次花丛懒回顾_半缘修道半缘君」的原创文章，遵循 CC 4.0 BY-SA 版权协议，转载请附上原文出处链接及本声明。
//		原文链接：https://blog.csdn.net/PriestessofBirth/article/details/79435124
//			要得到自然数n以内的全部素数，必须把不大于根号n的所有素数的倍数（2n,3n,4n,5n,6n）剔除，剩下的就是素数。
 */
package digit;

/**
 * @author ZYJ
 *埃氏筛法，经常作为一道题的一部分用来打一定范围内素数表，
 */
public class e_sushu {

	public static void main(String[] args) {	
		final int N = 10000000;
		int[] flag = new int[N];//java中赋初值为0，为0表示是素数
		int count = 0;
		for (int i = 0; i < flag.length; i++) {
			flag[i] = 0;
		}
		for (int i = 2; i < flag.length; i++) {//开始筛选,外层循环
			if(flag[i] == 0) {
				for (int j = i*2; j < flag.length ; j+=i) {
					flag[j]=1;
				}//i->2i->3i->4i->5i>挨个标记
				count++;
			}
		}
		
		
		System.out.println(count);
		//应用举例，打素数表
		for(int i=0;i<N;i++){
			if(flag[i]!=0)System.out.print(i + " ");
			if((i)%5==0)System.out.println();
		}
	}

}
