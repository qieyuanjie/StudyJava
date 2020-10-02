package character;
import java.util.Arrays;
public class RandomString {

	public static String getRandomString(int N) {

//		final int N = 5;
		short start = '0';
		short end = 'z' + 1;
		char[] rChar = new char[N]; 
		for (int i = 0; i < rChar.length; i++) {
			while(true) {
				char j = (char)(Math.random()*(end - start) + start);
				if(Character.isDigit(j)||Character.isLetter(j)) {
					rChar[i] = j;
					break;
				}	
			}
		}
		String result = new String(rChar);
//		System.out.println(rChar);
		return result;
		
		
		
//		//方法2
//        String pool = "";
//        for (short i = '0'; i <= '9'; i++) {
//            pool+=(char)i;
//        }
//        for (short i = 'a'; i <= 'z'; i++) {
//            pool+=(char)i;
//        }
//        for (short i = 'A'; i <= 'Z'; i++) {
//            pool+=(char)i;
//        }
//        
//        //以上先确定一个表，包含所有可能随机到的范围
//        //下面开始进行随机
//        char cs2[] = new char[5];
//        for (int i = 0; i < cs2.length; i++) {
//            int index = (int) (Math.random()*pool.length());
//            cs2[i] =  pool.charAt( index );
//        }
//        String result2 = new String(cs2);
//        System.out.println(result2);
	}
	public void sortArrays(String[] strs) {
//		str[2] = str[1];
//		System.out.println(str[2]);
		for (int i = 0; i < strs.length; i++) { // 外层for循环控制循环次数
			for (int j = 0; j < strs.length -i-1; j++) { // 内层for循环控制相邻的两个元素进行比较
				char firstChar1 = strs[j].charAt(0);
				char firstChar2 = strs[ j + 1 ].charAt(0);
				firstChar1 = Character.toLowerCase(firstChar1);
				firstChar2 = Character.toLowerCase(firstChar2);
				//这里'2''3'等数字都是字符'2''3'
				if(firstChar1 > firstChar2) {
					String temp = strs[j];
					strs[j] = strs[j+1];
					strs[j + 1] = temp;
				}
			}
		}
	}
	
	public static int allIn(String Key) {
		String pool = "";
        for (short i = '0'; i <= '9'; i++) {
        	pool+=(char)i;
        }
        for (short i = 'a'; i <= 'z'; i++) {
        	pool+=(char)i;
        }
        for (short i = 'A'; i <= 'Z'; i++) {
        	pool+=(char)i;
        }     
//      //以上先确定一个表，包含所有可能随机到的范围

//        char[] cs = new char[3];
        for(short i = 0;i<pool.length();i++) {
        	for (int j = 0; j < pool.length(); j++) {
				for (int k = 0; k < pool.length(); k++) {
//					cs[0] = pool.charAt(k);
//					cs[1] = pool.charAt(j);
//					cs[2] = pool.charAt(i);
					char[] cs = new char[]{pool.charAt(k),pool.charAt(j),pool.charAt(i)};
					//System.out.println(cs);
					String testKey= new String(cs);
					//System.out.println(testKey);
					if(testKey.equals(Key)) {
						System.out.println("密码是" + testKey);
						return 0;
						
					}
				}
			}
        }
        
        System.out.println("错误");
        return 1;
	}
	
	
	public static void allInD(String password,char[] guessPassword) {
		allInD(password,guessPassword,0);
	}
	public static void allInD(String password,char[] guessPassword,int index) {
		if(found)
			return;
		for(short i = '0';i <= 'z';i++) {
			char c = (char)i;
			if(!Character.isLetterOrDigit(c))//如果不是数字和字母
				continue;//那就跳过本次循环，继续下一次循环
			
			guessPassword[index] = c;//index下标,设置猜测密码数组下标第index为i的值
			if(index!=guessPassword.length - 1) {//如果下标没有达到最大值-1
				//那就继续让下标+1，递归调用
				allInD(password,guessPassword,index+1);
			}
			else {//下标达到最大值-1时
				String guess = new String(guessPassword);
//				System.out.println("此轮的guess为" + guess);
				if(guess.equals(password)) {//猜测值正好和密码相同时
					System.out.println("找到了，密码是：" + password);
					found = true;//标记为找到了
					return;
				}
			}
		}
	}
	//它生成的guess顺序是 
//	  000->001->002 .... ->ooz  				  
//	->010->011->012 .... ->01z   //此处就跳回到了index为1的那一次函数调用中，而后再次进入index为2的函数调用			  
//	->020->021->022 .... ->02z				  
//	.....				  
//	->100 ...			  		//此处就跳到了index为0的那一次函数调用，而后再次进入index为1的函数调用
//	....			  
//	->zz0->zz1->zz2 .... ->zzz
	
	public static boolean found = false;
	public static void main(String[] args) {
		//思想，random以后的值在0-1范围内 用他乘以 所需要范围的长度 ，得到这个范围表内的下标
		//法1
		RandomString rs1 = new RandomString();
        System.out.println(RandomString.getRandomString(5));
        
        String[] strs = new String[8];
        for (int i = 0; i < strs.length; i++) {
			strs[i] = RandomString.getRandomString(5);
//			System.out.println(str[i]);
		}
        System.out.println("未排序前的数组：");
        System.out.println(Arrays.toString(strs));
        
        rs1.sortArrays(strs);
        
        
        System.out.println("排序后的字符串数组:");
        System.out.println(Arrays.toString(strs));
        
        
        String randomKey = new String(RandomString.getRandomString(3));
        System.out.println(randomKey);
        RandomString.allIn(randomKey);
        char[] guessPassword = new char[randomKey.length()];
        RandomString.allInD(randomKey, guessPassword);
        
        	
	}
}
