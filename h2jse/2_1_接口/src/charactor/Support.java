package charactor;

public class Support extends Hero implements Healer{
	
	@Override
	public void heal() {
		System.out.println("您进行了一次治疗");
	}
	public static void main(String args []) {
	Support s1 = new Support();
	s1.heal();
	}
}