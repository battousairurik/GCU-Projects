package abstractNFLPlayer;

public class DefensivePlayer extends NFLPlayer{

	private int tackles;
	private int tackleAssists;
	private int interceptionsCaught;
	
	public DefensivePlayer(){
		
	}
	public void setDefensiveStats(int tackle, int assists, int intCaught){
		tackles = tackle;
		tackleAssists = assists;
		interceptionsCaught = intCaught;
	}
	public int getTackles(){
		return tackles;
	}
	public int getTackleAssists(){
		return tackleAssists;
	}
	public int getInterceptions(){
		return interceptionsCaught;
	}
}
