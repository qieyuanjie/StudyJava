package charactor;

import property.Item;
import property.LifePotion;

public class ADHero extends Hero implements AD {
    @Override
    public void physicAttack() {
        System.out.println("进行物理攻击");
    }

    public ADHero() {
        super("test");
    }

    public ADHero(String name) {
        super(name);
    }

    //子类重写useItem，并在其中调用父类的useItem方法
//    public void useItem(Item i) {
//    	System.out.println("ADHero use item");
//    	super.useItem(i);
//    }
    public static void main(String[] args) {
        ADHero h = new ADHero();
//        Item lp = new LifePotion();
//        h.useItem(lp);
    }

//练习
//父类Hero提供了一个有参的构造方法
//但是没有提供无参的构造方法
//子类应该怎么处理？

//作为子类，无论如何 都会调用父类的构造方法。
//默认情况下，会调用父类的无参的构造方法。
//但是，当父类没有无参构造方法的时候
//( 提供了有参构造方法，并且不显示提供无参构造方法)，
//重点！！！一旦一个类自己定义了构造函数，编译器就不会再给它提供缺省的构造函数了
//子类就会抛出异常，因为它尝试去调用父类的无参构造方法。
//这个时候，必须通过super去调用父类声明的、存在的、有参的构造方法

}