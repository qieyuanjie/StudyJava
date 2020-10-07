package charactor;

//
//instanceof 严格来说是Java中的一个双目运算符，
//用来测试一个对象是否为一个类的实例，用法为：
//
//boolean result = obj instanceof Class
//
//　其中 obj 为一个对象，Class 表示一个类或者一个接口，
//  当 obj 为 Class 的对象，或者是其直接或间接子类，或者是其接口的实现类，
//  结果result 都返回 true，否则返回false。
//
//　注意：编译器会检查 obj 是否能转换成右边的class类型，
//  如果不能转换则直接报错，如果不能确定类型，则通过编译，具体看运行时定。
public class Hero {
    String name;//姓名
    float hp;//血量
    float armor;//护甲
    int moveSpeed;// move Speed

    public boolean equals(Object o) {
        if (o instanceof Hero) {
            Hero h = (Hero) o;
            return this.hp == h.hp;
        }
        return false;
    }

    public String toString() {
        return name;
    }

    public void finalize() {
        System.out.println("这个英雄正在被回收");
    }

    public static void main(String[] args) {
        Hero h = new Hero();
        h.name = "盖伦";
        System.out.println(h.name.toString());
        //println的就是当前对象的字符串表达
        //即打印的就是h对象的toString()返回值
        System.out.println(h.name);

        Hero h1 = new Hero();
        h1.hp = 300;
        Hero h2 = new Hero();
        h2.hp = 400;
        Hero h3 = new Hero();
        h3.hp = 300;

        System.out.println(h1 == h2);
        System.out.println(h1 == h3);
        h3 = h1;
        System.out.println(h1 == h3);
        //== 用于判断两个引用，是否指向了同一个对象
    }


}

