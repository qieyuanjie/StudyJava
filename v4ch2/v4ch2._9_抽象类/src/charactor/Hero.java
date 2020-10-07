package charactor;

//父类被定义一个抽象类后，而且没有抽象方法的话，不能够直接实例化了
//就算有也不能实例化了（一句话抽象类不能实例化）
//有抽象方法的话，子类会被要求实现这个抽象方法
//（继承抽象类的子类需要实现父类的抽象方法，若不实现，子类必须声明为抽象类）
//父类为抽象类后，子类只能继承一个（Java只支持单继承，只能继承一个类，
//所有的类都继承或间接继承Object超类，子类继承抽象父类后，
//就是从继承Object超类装换为继承抽象的父类，而抽象的父类又继承的是Object超类）
public abstract class Hero {
    String name;//姓名
    float hp;//血量
    float armor;//护甲
    int moveSpeed;// move Speed

    public abstract void attack();

    public static void main(String[] args) {
        //虽然没有抽象方法，但是一旦被声明为了抽象类，就不能够直接被实例化
//        Hero h= new Hero();
    }
}

