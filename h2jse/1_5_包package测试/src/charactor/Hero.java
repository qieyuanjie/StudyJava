package charactor;
//武器在其他包内，必须需要使用import
import property.Weapon;

public class Hero {
	String name;//姓名
	float hp;
	float armor;//护甲
	int moveSpeed;
	//装备一把武器
    public void equip(Weapon w){
         
    }
	public static void main(String[] args) {
		Hero garen =new Hero();
		garen.name="盖伦";
		garen.hp=616.28f;
		garen.armor=27.536f;
		garen.moveSpeed=350;
		
		Hero teemo=new Hero();
		teemo.name="提莫";
		teemo.hp= 383f;
		teemo.armor = 14f;
		teemo.moveSpeed = 320;
	}
}
