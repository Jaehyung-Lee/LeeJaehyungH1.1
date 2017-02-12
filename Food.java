//Jaehyung Lee, 001312304
//Jaehyung, Junyoung, Sangha discussed about this homework
package LeeJaehyungH1;

public class Food extends Item {
//Set an integer values called "Nutrition" and "Quantity"
private int Nutrition;
private int Quantity;

//Set an accessor to figure out the Nutrition value of food
public int getNutrition(){
return Nutrition;
}

//Set a mutator to change the Nutrition value of food
public void setNutrition(){
	this.Nutrition = Nutrition;
}

//Set an accessor to figure out the Quantity value of food
public int getQuantity(){
	return Quantity;
}

//Set a mutator to change the Quantity value of food
public void setQuantity(){
	this.Quantity = Quantity;
}

//Set a mutator to make a new Quantity of food
public void setQuantity(int newQuantity) {
    this.Quantity = newQuantity;
}

//Set a constructor that calls Item's constructor and
//Set specific Nutrition value and Quantity value of food
public Food(int nutrition, int quantity){
	super("Food");
	this.Nutrition = 97;
	this.Quantity = 100;
    }
//Set a method call to complie the name and weight of food	
public static String examine() {
	return "This food's name is Apple, and its weight is 250g";
	}
	public static void main(String args[]){
	System.out.println(examine());
	
}

}



