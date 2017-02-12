//Jaehyung Lee, 001312304
//Jaehyung, Junyoung, Sangha discussed about this homework
package LeeJaehyungH1;

public class Armor extends Item {

//Set an integer value called "defense"
	private int defense;

//Set an accessor to figure out the defense of the armor
public int getDefense(){
	return defense;
}

//Set a mutator to change the defense of the armor
public void setDefense(int defense){
    this.defense = defense;
}

//Set a constructor to call the item's constructor method and
//Set the specific value of the armor
public Armor(int defense) {
super("Armor");
this.defense = 100;
}

//Define an examine the name and weight of the armor
public static String examine() {
return "This armor's name is Bulletproof Vest and its weight is 3.8kg";

}

public static void main(String args[]){
System.out.println(examine());

}
}

