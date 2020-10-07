package charactor;

public class Hero {
    public String name;
    protected float hp;

    public void kill(Mortal m) {
        System.out.println(name + "与英雄进行了一场对战，");
        m.die();
    }

    public static void main(String[] args) {
        Hero garen = new Hero();
        garen.name = "盖伦";
        APHero ap = new APHero();
        ADHero ad = new ADHero();
        ADAPHero adap = new ADAPHero();
        Mortal h;
        h = ap;
        garen.kill(h);
        h = ad;
        garen.kill(h);
        h = adap;
        garen.kill(h);

    }

}

