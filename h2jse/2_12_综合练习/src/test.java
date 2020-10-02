public class test{

	public static void main(String[] args) {
		Spider sp = new Spider();
		sp.eat();
		Cat C = new Cat();
		C.play();
		System.out.println("====1=====");

//		C.name = "狗狗";//name是私有的
//		C.play();
		System.out.println("=========2============");
		C.setName("狗狗");
		C.play();
		System.out.println("=======3=======");
		System.out.println(C.getName());
		System.out.println("======4========");
		C.eat();
		System.out.println("====5====");
		Cat C1 = new Cat("狗狗");
		C1.play();	
		System.out.println("====1=====");
		Fish F1 = new Fish();
		F1.play();
		
//		F1.name = "狗狗";//name为私有的
//		F1.play();
		System.out.println("=========2============");
		F1.setName("狗狗");
		F1.play();
		System.out.println("=======3=======");
		System.out.println(F1.getName());
		System.out.println("======4========");
		F1.eat();
	}
	
}