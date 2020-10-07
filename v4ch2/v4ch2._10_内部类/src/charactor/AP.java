package charactor;

//抽象类可以定义
//public,protected,package,private
//静态和非静态属性
//final和非final属性
//但是接口中声明的属性，只能是
//public
//静态
//final的
//即便没有显式的声明
public interface AP {
    public static final int resistMagic = 100;
    int resitMagic = 0;

    //resisMagic即便没有显式的声明为public static final
    //也会默认的隐式的声明为 public static final
    public void magicAttack();
}
