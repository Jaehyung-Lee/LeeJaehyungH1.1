//Jaehyung Lee, 001312304
//Jaehyung, Junyoung, Sangha discussed about this homework
package LeeJaehyungH1;

public class Item {
//Define a string that is called "Name"
	private String Name;
    private Integer Weight;
	
    //Create an accessor to find out the name of the item
	public String getName() {
		return Name;
	}
	
	//Create a mutator to be able to change the name of the item
   	public void setName(String name) {
        this.Name = name;
    }
	//Create an accessor to figure out the weight of item
    public int getWeight() {
		 return Weight;
	}
	//Create a mutator to be able to change the weight of the item 
    public void setWeight(String name) {
    	 this.Name = name;
    }
    //Set a constructor that takes in "name" as a parameter
    public Item(String name){
    	this.Name = name;
    }
    //Define an examine the name of the item
    public void examine(String name) {
         this.Name = name;
    }
    
    public Item(){
    	
    }
}
	

