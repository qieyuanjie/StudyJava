public class ADHero extends Hero{
	public void attack() {
		System.out.println(name + "进行了一次攻击，但不确定打中了谁");
		
	}
	public void attack(Hero h1) {
		System.out.println(name +"对"+h1.name+"进行了一次攻击");
		
	}
	public void attack(Hero...h) {
		for (int j = 0; j < h.length; j++) {
			System.out.println(name + "攻击了" + h[j].name);
		}
	
	}
	public static void main(String args[]) {
		ADHero bh = new ADHero();
		bh.name = "赏金猎人";
//法1，分别声明各个对象		
		Hero h1 = new Hero();
		h1.name = "提莫";
		Hero h2 = new Hero();
		h2.name = "盖伦";
//法2,使用对象数组		
		Hero h[] = new Hero[2] ;
		//初始化方法1
		h[0] = h1;
		h[1] = h2;
		//初始化方法2,静态初始化,用于有构造方法的类
//		Hero h[] = {new Hero("提莫"),new Hero("盖伦")} ;
		
		//错误的初始化
//		for (int i = 0; i < h.length; i++) {
//			h[i].name = "1" ;
//		}
		
//方法调用部分		
		bh.attack();
		bh.attack(h1,h2);
		bh.attack(h);
	}
	
}