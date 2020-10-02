//引用的概念，如果一个变量的类型是 类类型，而非基本类型，那么该变量又叫做引用。
//		如果一个变量是类类型
//		比如 Hero h = new Hero();
//		我们以后就管变量h叫做引用。
//		=不再是赋值的意思
//		=表示指向的意思
//		小结，类类型的变量又叫引用
public class Hero {
	String name;//姓名
	float hp;
	float armor;//护甲
	int moveSpeed;
	
	public Hero() {
		
	}
	
	public Hero(String name,float hp) {
		this.name=name;
		this.hp=hp;
	}
	//上面的构造方法等价于下面的构造方法
//	public Hero(String na,float h) {
//		name=na;
//		hp=h;
//	}
	
//复活方法
	public void revive(Hero h1) {
		h1 = new Hero("复活提莫",383);
		System.out.println("我是"+h1.name + ",我的hp是" + h1.hp);
	}
	public static void main(String[] args) {
		 Hero teemo =  new Hero("提莫",383);
	        //受到400伤害，挂了
	        teemo.hp = teemo.hp - 400;
	        //启动复活方法
	        teemo.revive(teemo);
	        //检查复活成功了吗
	        System.out.println("我复活成功了吗？我的hp是" + teemo.hp);
	}
}
