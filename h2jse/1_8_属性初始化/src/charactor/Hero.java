package charactor;

public class Hero {
//	对象属性初始化有3种
//	1. 声明该属性的时候初始化
//	2. 构造方法中初始化
//	3. 初始化块
	public String name = "some hero"; //声明该属性的时候初始化
	//上面这种写法在c++11以后才被允许
    protected float hp;
    float maxHP;
    {
        maxHP = 200; //初始化块
    }
    public Hero(){
        hp = 100; //构造方法中初始化
         
    }
//    类属性初始化有2种
//    1. 声明该属性的时候初始化
//    2. 静态初始化块
  //物品栏的容量
    public static int itemCapacity=8; //声明的时候 初始化
    public static int item;
    static{
        item = 6;//静态初始化块 初始化
    }
    public static void main(String[] args) {
        System.out.println(Hero.itemCapacity);
    }
    
    //注意,
//    依次出来的是
//    some hero    ----声明该属性的初始化
//    the hero       ------初始化块
//    one hero      -------构造方法里的
    //这与c++11标准相同
    //其中--初始化块可以对应c++中的参数列表初始化,类似 :a(1)
}
