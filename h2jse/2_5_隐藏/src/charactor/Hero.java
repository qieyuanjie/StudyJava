package charactor;
//一个指向子类对象的父类引用变量来调用父子同名的静态方法时，
//只会调用父类的静态方法。
//因为是类方法 所以 无论引用指向哪，都应该按类方法调用进行

//与重写类似，方法的重写是子类覆盖父类的 对象方法
//隐藏，就是子类覆盖父类的 类方法
public class Hero {
    public String name;
    protected float hp;
    
    //类方法，静态方法
    //通过类就可以直接调用
    public static void battleWin(){
        System.out.println("hero battle win");
    }
}

