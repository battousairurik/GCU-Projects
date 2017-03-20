import java.util.Random;

public class CreatePlayers {

	static Random r1 = new Random();
	
	public static void generatePlayers(){
		
		NFLPlayer player1 = new NFLPlayer(PlayerManager.availablePlayers[0], PlayerManager.pPosition[0]);
		player1.setYards(r1.nextInt(100), r1.nextInt(100), r1.nextInt(100), r1.nextInt(100));
		double totalYards = NFLPlayer.passingYards + NFLPlayer.kickingYards 
				+ NFLPlayer.rushingYards + NFLPlayer.recievingYards;
		player1.setGenerics(r1.nextInt(30), totalYards);
		player1.setOffense1(r1.nextInt(20), r1.nextInt(20), r1.nextInt(20), r1.nextInt(20));
		player1.setOffense2(r1.nextInt(20), r1.nextInt(20), r1.nextInt(20), r1.nextInt(20));
		player1.setDefense(r1.nextInt(20), r1.nextInt(20), r1.nextInt(20));
		player1.printPlayer();
	}
	
	public static void main(String[] args) {
		PlayerManager.CreatePlayers();
		generatePlayers();
		
	}

}
