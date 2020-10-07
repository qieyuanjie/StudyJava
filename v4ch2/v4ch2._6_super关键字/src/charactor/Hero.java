package charactor;

import property.Item;

public class Hero {
    String name;//姓名
    float hp;//血量
    float armor;//护甲
    int moveSpeed;// move Speed

    public void useItem(Item i) {
        System.out.println("Hero use item");
        i.effect();
    }

    //    public Hero() {
//    	
//    }
    public Hero(String name) {
        System.out.println("调用Hero的有参构造函数");
        this.name = name;
        System.out.println(name);
    }


}

