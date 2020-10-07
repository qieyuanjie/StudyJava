package charactor;
//武器在其他包内，必须需要使用import

import property.Weapon;

public class Hero {
    public String name;//姓名
    protected int moveSpeed;
    int id;
    // 无修饰符(package)的属性 id
    // 自己可以访问
    // 同包子类可以继承
    // 不同包子类不能继承
    // 同包类可以访问
    // 不同包类不能访问
    protected float hp;
    protected float armor;//护甲

    //装备一把武器
    public void equip(Weapon w) {

    }

}
