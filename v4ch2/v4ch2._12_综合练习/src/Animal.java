
public abstract class Animal {
    protected int legs;

    protected Animal(int legs) {
        this.legs = legs;
    }

    public void walk() {
        System.out.println("用" + legs + "条腿走路");
    }

    public abstract void eat();


}