package abstractNFLPlayer;

import java.util.Random;

public class OffensivePlayer extends NFLPlayer{

	private double totalYards;
	
	private double rushingYards;
	private double passingYards;
	private double recievingYards;
	private double kickingYards;
	
	private int interceptionsThrown;
	private int fieldGoals;
	private int kickReturns;
	private int punts;
	private int sacks;
	private int touchDowns;
	private int timesTackled;
	private int fumbles;
	
	public OffensivePlayer(){
		
	}
	public void setYards(double rush, double pass, double recieve, double kick){
		rushingYards = rush;
		passingYards = pass;
		recievingYards = recieve;
		kickingYards = kick;
		totalYards = rush + pass + recieve + kick;
	}
	public double getPassing(){
		return passingYards;
	}
	public double getRushing(){
		return rushingYards;
	}
	public double getRecieving(){
		return recievingYards;
	}
	public double getKicking(){
		return kickingYards;
	}
	public double getTotal(){
		return totalYards;
	}
	public void setOffense1 (int thrown, int goals, int returns, int punt)
	{
		interceptionsThrown = thrown;
		fieldGoals = goals;
		kickReturns = returns;
		punts = punt;
	}
	public int getThrown(){
		return interceptionsThrown;
	}
	public int getGoals(){
		return fieldGoals;
	}
	public int getReturns(){
		return kickReturns;
	}
	public int getPunts(){
		return punts;
	}
	public void setOffense2 (int sack, int td, int tackle, int fumble)
	{
		sacks = sack;
		touchDowns = td;
		timesTackled = tackle;
		fumbles = fumble;
	}
	public int getSacks(){
		return sacks;
	}
	public int getTouchDowns(){
		return touchDowns;
	}
	public int getTimesTackled(){
		return timesTackled;
	}
	public int getFumbles(){
		return fumbles;
	}
	@Override public void celebrate(){
		Random r1 = new Random();
		int choice = r1.nextInt(3) + 1;
		if (choice == 1){
			setCelebration(" throws the ball in the air!");
			displayCelebrate();
		}
		else if (choice == 2){
			setCelebration(" kicks the ball to the fans!");
			displayCelebrate();
		}
		else if (choice == 3){
			setCelebration();
			displayCelebrate();
		}
			
	}
}
