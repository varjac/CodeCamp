
public class Drink implements IJob{
	
	String [] finishedDrink;

	public void Start() {
		finishedDrink = new String [2];
	}

	public boolean Sync() {
		return false;
	}

	public boolean SendToHost() {
		if(true){//able to send (bluetooth)
			return true;
		}
		return false;		
	}
	
	public void selectDrinkSize(String drinkSize){
		finishedDrink[0] = drinkSize;
	}
	
	public void selectDrinkType(String drinkType){
		finishedDrink[1] = drinkType;
	}
	
	public void clearDrink(){
		finishedDrink = null;
	}
	
	
	/**public void addItem(String item){
	 * 		if(item.startsWith('1'){
	 * 			finishedDrink[0] = item;
	 * 		}
	 * 		else if (item.startsWith('2'){
	 * 			finishedDrink[1] = item;
	 * 		}
	 * 		else if (item.startsWith('3'){
	 * 			finishedDrink[2] = item;
	 * 		}
	 * }
	 */


}
