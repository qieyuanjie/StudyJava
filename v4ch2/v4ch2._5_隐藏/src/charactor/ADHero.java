package charactor;

public class ADHero extends Hero implements AD {


    @Override
    public void physicAttack() {
        System.out.println("进行物理攻击");
    }

    //	@Override
//	public void die() {
//		System.out.println("ADHero death");
    //隐藏父类的battlewin方法
    public static void battleWin() {
        System.out.println("ADHero battle win");
    }

    public static void main(String[] args) {
        Hero.battleWin();    //调用父类类方法
        ADHero.battleWin();//调用子类ADHero的
        Hero ad = new ADHero();//依然调用父类的
        ad.battleWin();//这里的ad是父类的对象，
        //它是父类类型的引用，但却指向子类
        //这时依然调用父类的battleWin方法
        //更为标准的访问方式是
        Hero.battleWin();
    }


}