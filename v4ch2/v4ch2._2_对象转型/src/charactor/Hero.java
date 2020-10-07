package charactor;

public class Hero {
    public String name;
    protected float hp;

    public static void main(String[] args) {
        //子类转父类
        Hero h = new Hero();
        ADHero ad = new ADHero();
        h = ad;//父类对象是h，子类对象是ad，
        //h(Hero)引用指向他的子类对象ad(ADHero)是可以的

        //父类转子类要强制转换
        //强制转换的意思就是 转换有风险，风险自担
        ad = (ADHero) h;
        //ad引用(ad本来所指向的对象是ADHero),指向h(h本来所指向的对象也是ADHero)
        //即把ADHero转换为ADHero，就能转换成功。
        //但是下面的转换是明显不行的
//    	ad = (Hero)h;
//    	这里本来ad(ADHero)和h(ADHero)都是指向ADHero,
        //但却先把h强制转换成Hero了，这时h(Hero)
//    	这样最后就成了让ad(ADHero)去指向一个h(Hero)，这明显是不行的
        //即不能从Hero转换成ADHero

    }
}
