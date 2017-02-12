//Jaehyung Lee, 001312304
//Jaehyung, Junyoung, Sangha discussed about this homework
package LeeJaehyungH1;

public class Weapon extends Item {

//Set an integer value called "damage"
	private int damage;

//Set an accessor to figure out the damage of the weapon
	public int getDamage() {
		return damage;
	}

//Set a mutator to change the damage of the weapon
	public void setDamage(int damage) {
		this.damage = damage;
	}

//Set a constructor to call the item's constructor method and
//Set the specific damage value of the weapon
    public Weapon(int damage) {
    	super("Weapon");
    	this.damage = 100;
    }

//Define an examines the name and weight of the weapon
    public static String examine() {
    return "This weapon's name is AK47 and has a weight 4.3kg";
    }
public static void main (String[] args) {
	System.out.println(examine());
    }
}

