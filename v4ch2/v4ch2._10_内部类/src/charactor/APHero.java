package charactor;

public class APHero extends Hero implements AP, Mortal {


    @Override
    public void magicAttack() {
        System.out.println("进行魔法攻击");
    }

    @Override
    public void die() {

        System.out.println("APHero death");
    }

    //	@Override
    public void attack() {
        magicAttack();
    }
}