import java.util.Scanner;
   
public class eg002 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int i = s.nextInt();
        System.out.println("读取的整数是"+ i+i);
        String rn = s.nextLine();
        String a = s.nextLine();
        System.out.println("读取的字符串是："+a);
    }
}