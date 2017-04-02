package abstractNFLPlayer;

public class TestPlayer {

	public static void main(String[] args) {
		NFLPlayer player = new OffensivePlayer();
		player.setGenerics("Bill Riley", "Quarterback", 5, 5);
		player.celebrate();
		//is in working order.
	}

}
