package charactor1;

import charactor.Hero;

public class Support extends Hero{
	public void heal() {
		System.out.println("使用了治疗，但没有命中");
	}
	public void heal(Hero ... h) {
		//常见错误 h[i]要改为h[i].name
//		for (int i = 0; i < h.length; i++) {
//			System.out.println(name + "治疗了" + h[i]);
//		}
		for (int i = 0; i < h.length; i++) {
			System.out.println(name + "治疗了" + h[i].name);
		}
	}
	public static void main(String args[]) {
		Support h1 = new Support();
		h1.name = "提莫";
		Support h2 = new Support();
		h2.name = "盖伦";
		Support[] h = new Support[2];
		h[0] = h1;
		h[1] = h2;
		Support bh = new Support();
		bh.name = "赏金猎人";
		bh.heal();
		bh.heal(h1,h2);
		bh.heal(h);
	}
}