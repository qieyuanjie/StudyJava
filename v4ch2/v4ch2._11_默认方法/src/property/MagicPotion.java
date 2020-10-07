package property;

public class MagicPotion extends Item {
    public void effect() {
        System.out.println("蓝瓶使用后可以回蓝");
    }

    public boolean disposable() {
        return true;
    }
}