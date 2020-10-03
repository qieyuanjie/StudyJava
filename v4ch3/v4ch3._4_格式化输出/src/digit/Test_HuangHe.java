/**
 * 借助Scanner 读取字符串数据，然后用格式化输出下面

浙江温州最大皮革厂江南皮革厂倒闭了，王八蛋老板黄鹤吃喝嫖赌，
欠下了3.5个亿，带着他的小姨子跑了!我们没有办法，拿着钱包抵工资!原价都是一百多、
两百多、三百多的钱包，现在全部只卖二十块，统统只要二十块!黄鹤王八蛋，
你不是人!我们辛辛苦苦给你干了大半年，你不发工资，你还我血汗钱，还我血汗钱!
 */
package digit;

/**
 * @author ZYJ
 *
 */
import java.util.Scanner;//导入Scanner类
public class Test_HuangHe {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String sentenceFormat ="%s最大%s%s倒闭了，王八蛋老板%s吃喝嫖赌，欠下了%.0f个亿，%n"
				+ "带着他的小姨子跑了!我们没有办法，拿着%s抵工资!原价都是一%s多、两%s多、三%s多的%s，%n"
				+ "现在全部只卖二十块，统统只要二十块!%s王八蛋，你不是人!我们辛辛苦苦给你干了大半年，你不发工资，%n"
				+ "你还我血汗钱，还我血汗钱!";
		Scanner s = new Scanner(System.in);
		
		System.out.format("请输入地名：%n");
		String area = s.nextLine();//地名
		
		System.out.format("请输入公司类型：%n");
		String companyClass = s.nextLine();
		
		System.out.format("请输入公司名称：%n");
		String companyName = s.nextLine();
		
		
		System.out.format("请输入老板名称：%n");
		String bossName = s.nextLine();
		
		System.out.format("请输入金额：%n");
		float amount = s.nextFloat();//金额
		
		
		System.out.format("请输入产品：%n");
		s.nextLine();//取走换行符
		//如果在通过nextInt()读取了整数后，再接着读取字符串，
//		读出来的是回车换行:"\r\n",因为nextInt仅仅读取数字信息，
//		而不会读取回车换行"\r\n".
		String production = s.nextLine();//产品
		
		System.out.format("请输入价格计量单位：%n");
		String priceUnitOfMeasure = s.nextLine();//计量单位
		
		System.out.format(sentenceFormat, area,companyClass,companyName,bossName,amount,production,priceUnitOfMeasure,priceUnitOfMeasure,priceUnitOfMeasure,production,bossName);
		
	}

}
