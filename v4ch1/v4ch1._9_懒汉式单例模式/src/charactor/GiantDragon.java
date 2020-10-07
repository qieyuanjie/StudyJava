﻿package charactor;

//懒汉式单例模式与饿汉式单例模式不同，
//只有在调用getInstance的时候，才会创建实例
//什么是单例模式？
//回答的时候，要答到三元素
//1. 构造方法私有化
//2. 静态属性指向实例
//3. public static的 getInstance方法，返回第二步的静态属性
public class GiantDragon {
    //1.先把构造方法私有化，使得无法在类外使用new 来实例化一个对象
    private GiantDragon() {

    }

    //准备一个静态属性(静态变量，或称类属性)
    //用来指向实例化对象，但现在暂时指向null
    private static GiantDragon instance;
    //instance是变量名称 

    //public static 方法，用来返回实例对象
    public static GiantDragon getInstance() {
        if (instance == null) {
            instance = new GiantDragon();
        }
        return instance;
    }

}
