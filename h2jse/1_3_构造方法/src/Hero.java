//	通过一个类创建一个对象，这个过程叫做实例化
//	实例化是通过调用构造方法(又叫做构造器)实现的
	
public class Hero {
	String name;//姓名
	float hp;
	float armor;//护甲
	int moveSpeed;
	//方法名和类名一样(注意大小写)
	//构造方法没有返回值
//	public Hero() {
//		System.out.println("实例化一个对象时，必定调用构造方法");
//	}
	
	//这个无参的构造方法，如果不写，
    //就会默认提供一个缺省的无参的构造方法
//	public Hero() {
//		
//	}
	
	//有参的构造方法,此时不在提供缺省无参的构造方法
	public Hero(String na) {
		System.out.println("实例化一个对象时，必定调用构造方法");
		name = na;
	}
	//带两个参数的构造方法
    public Hero(String name,float hp){
        this(name);//this指针和带一个参构造函数的联用
        System.out.println("两个参数的构造方法");
        this.hp = hp;
    }
	public static void main(String[] args) {
//		Hero garen =new Hero();
//		garen.name="盖伦";
//		garen.hp=616.28f;
//		garen.armor=27.536f;
//		garen.moveSpeed=350;
//		
//		Hero teemo=new Hero();
//		teemo.name="提莫";
//		teemo.hp= 383f;
//		teemo.armor = 14f;
//		teemo.moveSpeed = 320;
		
		Hero garen = new Hero("盖伦");
		System.out.println(garen.name);
		Hero h = new Hero("提莫",300);
		System.out.println(h.name);
	}
}
