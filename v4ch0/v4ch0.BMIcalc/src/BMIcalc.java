import java.util.Scanner;
public class BMIcalc{
	public static void main(String[] arg) {
		var sc = new Scanner(System.in);
		float heigh = sc.nextFloat();
		float weigh = sc.nextFloat();
		float BMI = weigh/(heigh*heigh);
		System.out.println("身高是" + heigh + ",体重是 "+ weigh + ",BMI是" + BMI);
		if(BMI < 18.5)System.out.println("1");
		else if(BMI < 24)System.out.println("2");
		else if(BMI < 27)System.out.println("3");
		else if(BMI < 30)System.out.println("4");
		else if(BMI < 35)System.out.println("5");
		else System.out.println("6");
	}
}