package charactor;

//接口中定义了抽象方法，
//但不必像抽象类那样在接口名称前面和抽象方法前面加abstract修饰符
//对的，interface（接口）不用加abstract修饰，
//class加了abstract修饰符的即为抽象类，
//method(方法)加了abstract修饰符的就是抽象方法，
//abstract修饰符主要区分普通  类、方法跟抽象  类、方法
public interface AD {
    //物理伤害
    public void physicAttack();

    default public void attack() {
        System.out.println("默认的ad attack");
    }
}
