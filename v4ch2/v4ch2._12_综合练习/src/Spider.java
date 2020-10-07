public class Spider extends Animal {
    public Spider() {
        super(8);
    }

    public void eat() {
        System.out.println("蜘蛛吃了东西");
    }

    public static void main(String[] args) {
        Spider sp = new Spider();
        sp.eat();
    }
}