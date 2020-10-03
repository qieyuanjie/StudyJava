public class Fish extends Animal implements Pet{
	private String name;
	public Fish() {
		super(0);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void play() {
		System.out.println("鱼名为" + name);
	}
	public void walk() {
		System.out.println("鱼没有腿，不能走路");
	}
	public void eat() {
		System.out.println("鱼吃了东西");
	}
	public static void main(String[] args) {
		Fish F1 = new Fish();
		F1.play();
		System.out.println("====1=====");
		F1.name = "狗狗";
		F1.play();
		System.out.println("=========2============");
		F1.setName("狗狗");
		F1.play();
		System.out.println("=======3=======");
		System.out.println(F1.getName());
		System.out.println("======4========");
		F1.eat();

	}
}