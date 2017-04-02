package abstractNFLPlayer;

import java.util.Random;

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
	@Override public void celebrate(){
		Random r1 = new Random();
		int choice = r1.nextInt(3) + 1;
		if (choice == 1){
			setCelebration(" hugs their fellow teammates!");
			displayCelebrate();
		}
		else if (choice == 2){
			setCelebration(" bumps pads with the others!");
			displayCelebrate();
		}
		else if (choice == 3){
			setCelebration();
			displayCelebrate();
		}
			
	}
}
