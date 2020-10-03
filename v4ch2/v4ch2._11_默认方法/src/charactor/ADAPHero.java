package charactor;
public class ADAPHero extends Hero implements AD,AP,Mortal{

	
	@Override
	public void magicAttack() {
		System.out.println("进行魔法攻击");
	}
	@Override
	public void physicAttack() {
		System.out.println("进行物理攻击");
	}
	@Override
	public void die() {
		System.out.println("ADAPHero death");
	}
	@Override
	public void attack() {
		magicAttack();
		physicAttack();
	}
	//在此类中，必须要将两个接口(AD AP)中都存在的默认方法进行重写
//	接口有默认方法的话，
//	那么实现类，就可以说继承了（默认方法可以理解为继承）这个方法
//
//	既然是AD,AP两个接口内的都是同样的默认方法，
//	那么实现类，就必须重写这个同名的方法，不然不知道调用的是谁的方法
//	（本身就会有冲突报错，必须重写这个方法）
//
//	所以根本不需要考虑这个方法是从哪个接口获取的（因为同名的必须重写）
	public static void main(String[] args) {
		ADAPHero adap = new ADAPHero();
		adap.attack();

	}
}