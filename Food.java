
public class Food implements IJob{
	private String[] order;
	
	public void Start() {
		order = new String[3];
	}
	
	//button gets pressed
	//button calls addItem("3Ketchup");
	public void addItem(String item){
		if(item.startsWith("1")){
			order[0] = item;
		}
		else if(item.startsWith("2")){
			order[1] = item;
		}
		else if(item.startsWith("3")){
			order[2] = item;
		}
	}
	
	public boolean sendItem(){
		return SendToHost(order);
	}
	
	@Override
	public boolean Sync() {
		return false;
	}

	@Override
	public boolean SendToHost(String[] orderItem) {	
		
		
		
		//bluetooth send item
		System.out.println(orderItem);
		
		if(true)//host receives String[]
			return true;
		return false;
		
	}

}
