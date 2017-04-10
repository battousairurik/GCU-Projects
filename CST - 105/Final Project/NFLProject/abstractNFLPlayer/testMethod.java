package abstractNFLPlayer;

public class testMethod {

	protected static void createPlayers(){
		PlayerManager test = new PlayerManager();
		test.createPlayers();
	}
	public static void main(String[] args) {
		//createPlayers();
		DisplayApplet applet = new DisplayApplet();
		applet.start();
		
	}

}
