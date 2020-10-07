package charactor;

public abstract class Hero {
    String name;//姓名
    float hp;//血量
    float armor;//护甲
    int moveSpeed;// move Speed

    public abstract void attack();

    class BattleScore {
        int kill;
        int die;
        int assit;

        //    	语法: new 外部类().new 内部类()
//    	作为Hero的非静态内部类，是可以直接访问外部类的private实例属性name的
        public void legendary() {
            if (kill >= 8)
                System.out.println(name + "超神");
            else
                System.out.println(name + "尚未超神");
        }
    }

    private static void battleWin() {
        System.out.println("battle win");
    }

    public String getname() {
        return name;
    }

    //敌方的水晶
    static class EnemyCrystal {
        int hp = 5000;

        //当水晶的血量为0时，则宣布胜利
        public void checkIfVictory() {
            if (hp == 0) {
                Hero.battleWin();
                //静态类不能直接访问外部类的对象属性
//    			System.out.println(name + "win this game");
                //静态类不能直接访问外部类的非静态方法
//    			String name = Hero.getname();

            }
//    		Hero.battleWin();
        }
    }

    public static void main(String[] args) {
        //在匿名类中使用外部的局部变量，外部的局部变量必须用final修饰
//    	注：在jdk8中，已经不需要强制修饰成final了，
//    	如果没有写final，不会报错，因为编译器偷偷的帮你加上了看不见的final
        final int damage = 5;
//    	Hero h = new Hero();//错误的定义方法
        Hero h = new Hero() {
            public void attack() {
                //使用printf函数
                System.out.printf("新的进攻手段，造成%d点伤害", damage);
            }
        };
        h.attack();

    }
//    public static void main(String[] args) {
//    	ADHero ad = new ADHero();
//    	ad.attack();
//    	System.out.println(ad);
//    	
////    	匿名类指的是在声明一个类的同时实例化它，使代码更加简洁精练
////    	通常情况下，要使用一个接口或者抽象类，都必须创建一个子类
//    	
////    	有的时候，为了快速使用，直接实例化一个抽象类，并“当场”实现其抽象方法。
////    	既然实现了抽象方法，那么就是一个新的类，
////    	只是这个类，没有命名(系统会自动分配一个类名给他)
////    	这样的类，叫做匿名类
//    匿名类要声明在代码块中，声明时即进行实现，对Item类进行匿名继承。
//    	Hero h = new Hero() {
//    		//	当场实现attack方法
//    		public void attack() {
//    			System.out.println("新的静态攻击手段");
//    		}
//    	};
//    	h.attack();
//    	//通过打印h,可以看到h这个对象属于系统自动分配的Hero$1类
//    	System.out.println(h);
//    	
//    	
////   	本地类可以理解为有名字的匿名类
////    	内部类与匿名类不一样的是，
////    	内部类必须声明在成员的位置，即与属性和方法平等的位置。
////    	本地类和匿名类一样，直接声明在代码块里面，
////    	可以是主方法，for循环里等等地方
//    	//与匿名类不同的是，本地类的类名是自己定义的
//    	class SomeHero extends Hero{
//    		public void attack() {
//    			System.out.println(name + " 另外一种新的攻击手段");
//    		}
//    	}
//    	
//    	SomeHero sh = new SomeHero();
//    	sh.name = "地卜师";
//    	sh.attack();
//    	
//    }
//   public static void main(String[] args) {
    //虽然没有抽象方法，但是一旦被声明为了抽象类，就不能够直接被实例化
//        Hero h= new Hero();

//    	Hero garen = new Hero();
//    	garen.name = "盖伦";
//    	
//    	//实例化内部类
//    	//BattleScore类在只有英雄对象存在时才有意义
//    	//所以实例化内部类时，必须建立在外部类对象基础上
//    	BattleScore score = garen.new BattleScore();
//    	score.kill = 7;
//    	score.legendary();
//    	score.kill = 9;
//    	score.legendary();
////    	在一个类里面声明一个静态内部类
////    	比如敌方水晶，当敌方水晶没有血的时候，己方所有英雄都取得胜利，
////    	而不只是某一个具体的英雄取得胜利。
////    	与非静态内部类不同，静态内部类水晶类的实例化 不需要一个外部类的实例为基础，可以直接实例化
////    	语法：new 外部类.静态内部类();
////    	因为没有一个外部类的实例，
////    	所以在静态内部类里面不可以访问外部类的实例属性和方法
////    	除了可以访问外部类的私有静态成员外，静态内部类和普通类没什么大的区别
//    	//实例化静态内部类
//    	Hero.EnemyCrystal crystal = new Hero.EnemyCrystal();
//    	crystal.checkIfVictory();

    //   }
}

