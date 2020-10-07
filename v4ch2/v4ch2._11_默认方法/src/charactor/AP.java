package charactor;

public interface AP {
    public static final int resistMagic = 100;
    int resitMagic = 0;

    //resisMagic即便没有显式的声明为public static final
    //也会默认的隐式的声明为 public static final
    public void magicAttack();

    default public void attack() {
        System.out.println("ap attack");
    }
}
