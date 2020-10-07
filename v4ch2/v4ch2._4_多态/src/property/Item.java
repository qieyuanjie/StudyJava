package property;

//
//类的多态
//父类引用指向子类对象
//要实现类的多态，需要如下条件
//1. 父类（接口）引用指向子类对象
//2. 调用的方法有重写
public class Item {
    String name;
    int price;

    public void buy() {
        System.out.println("购买");
    }

    public void effect() {
        System.out.println("物品使用后，可以有效果 ");
    }

    public static void main(String[] args) {
        Item i1 = new LifePotion();
        Item i2 = new MagicPotion();
        System.out.print("i1  是Item类型，执行effect打印:");
        i1.effect();
        System.out.print("i2也是Item类型，执行effect打印:");
        i2.effect();
    }

}