import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;


public class Food implements IJob{

	private String[] order;
	PrintWriter out;
	Socket clientSocket;
	
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
	
	@Override
	public boolean Sync() {
		
		try {
			clientSocket = new Socket("Food", 4444);
			 out = new PrintWriter(clientSocket.getOutputStream(), true);
		} catch (UnknownHostException e) {
			e.printStackTrace();
			return false;
		} catch (IOException e) {
			e.printStackTrace();
			return false;
		}
			//Hail Hydra
			return true;
		
	}

	@Override
	public boolean SendToHost() {
		Sync();
		//Ideally this would be done in an app on a phone or tablet
		//connected through Bluetooth.
		System.out.println(order);
		out.print(order);
		out.flush();
		out.close();
		try {
			clientSocket.close();
		} catch (IOException e) {
			e.printStackTrace();
			return false;
		}
		return true;
		
	}

}
