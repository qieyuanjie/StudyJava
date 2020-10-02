package character;
import java.util.Scanner;
public class ToCharArray {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		System.out.println("输入的字符为：[" + str + "]");
		char[] cs = str.toCharArray();
		
		for (int i = 0; i < cs.length; i++) {
			if(Character.isUpperCase(cs[i])||Character.isDigit(cs[i])) {
				System.out.println(cs[i]);
				
			}
			
		}

	}

}
