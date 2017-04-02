package abstractNFLPlayer;

public abstract class NFLPlayer implements Celebrator{

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
	private String celebration;
	public void celebrate(){
		setCelebration();
		displayCelebrate();
	}
	public void setCelebration(){
		celebration = " does a little dance!";
	}
	public void displayCelebrate(){
		System.out.println(playerName + celebration);
	}
	public String setCelebration(String input){
		celebration = input;
		return celebration;
	}
}
