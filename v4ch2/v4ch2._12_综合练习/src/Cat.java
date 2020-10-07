public class Cat extends Animal implements Pet {
    private String name;

    public Cat() {
        this("");
    }

    public Cat(String name) {
        super(4);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void play() {
        System.out.println("猫名为" + name);
    }

    public void eat() {
        System.out.println("猫吃了东西");
    }

    public static void main(String[] args) {
        Cat C = new Cat();
        C.play();
        System.out.println("====1=====");
        C.name = "狗狗";
        C.play();
        System.out.println("=========2============");
        C.setName("狗狗");
        C.play();
        System.out.println("=======3=======");
        System.out.println(C.getName());
        System.out.println("======4========");
        C.eat();
        System.out.println("====5====");
        Cat C1 = new Cat("狗狗");
        C1.play();
    }
}