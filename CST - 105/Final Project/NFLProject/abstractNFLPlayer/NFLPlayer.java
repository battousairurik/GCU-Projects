package abstractNFLPlayer;

public abstract class NFLPlayer {

	private String playerName;
	private String playerPosition;
	private int gamesPlayed;
	private int yearsPlayed;
	
	public NFLPlayer(){
		
	}
	public void setGenerics(String name, String position, int games, int years){
		playerName = name;
		playerPosition = position;
		gamesPlayed = games;
		yearsPlayed = years;
	}
	public String getName(){
		return playerName;
	}
	public String getPosition(){
		return playerPosition;
	}
	public int getGames(){
		return gamesPlayed;
	}
	public int getYears(){
		return yearsPlayed;
	}
	
}
