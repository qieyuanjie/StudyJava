package charactor;

public class TestGiantDragon {
    public static void main(String[] args) {
        //new一个对象就会报错
//		GiantDragon g1 = new GiantDragon();

        //只能通过get函数来获得实例化对象()

        GiantDragon g1 = GiantDragon.getInstance();
        GiantDragon g2 = GiantDragon.getInstance();

        //g1 g2都是同一个对象
        if (g1 == g2) System.out.println("yes!");
    }
}