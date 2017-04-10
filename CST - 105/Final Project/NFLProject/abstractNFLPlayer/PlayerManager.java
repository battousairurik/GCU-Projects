package abstractNFLPlayer;

public class PlayerManager {
	
	protected PlayerManager(){	
		
	}
	protected DefensivePlayer[] defensivePlayers = new DefensivePlayer[22];
	protected OffensivePlayer[] offensivePlayers = new OffensivePlayer[22];
	protected CreatePlayers playerCreation = new CreatePlayers();
	
	protected int offensiveCount = 0;
	protected int defensiveCount = 0;
	
	protected void createPlayers(){
		while (offensiveCount < 11){
			offensivePlayers[offensiveCount] = new OffensivePlayer();
			offensivePlayers[offensiveCount].setGenerics(
				playerCreation.generatePlayerName(), 
				playerCreation.generatePosition("offensive"), 
				playerCreation.generateGamesPlayed(), 
				playerCreation.generateYearsPlayed());
			offensivePlayers[offensiveCount].setYards(
					playerCreation.generateYards("rush"), 
					playerCreation.generateYards("passing"), 
					playerCreation.generateYards("recieving"), 
					playerCreation.generateYards("kicking"));
			offensivePlayers[offensiveCount].setOffense1(
					playerCreation.generateLowStat(), 
					playerCreation.generateLowStat(), 
					(int)playerCreation.generateYards("kickReturns"), 
					playerCreation.generateLowStat());
			offensivePlayers[offensiveCount++].setOffense2(
					(playerCreation.generateLowStat() * 2),
					playerCreation.generateLowStat(),
					playerCreation.generateLowStat(),
					playerCreation.generateLowStat());
		}
		while (defensiveCount < 11){
			defensivePlayers[defensiveCount] = new DefensivePlayer();
			defensivePlayers[defensiveCount].setGenerics(
					playerCreation.generatePlayerName(), 
					playerCreation.generatePosition("defensive"), 
					playerCreation.generateGamesPlayed(), 
					playerCreation.generateYearsPlayed());
			defensivePlayers[defensiveCount++].setDefensiveStats(
					playerCreation.generateTackles(),
					playerCreation.generateTackleAssists(),
					playerCreation.generateLowStat());
		}
		playerCreation.resetCounts();
		while (offensiveCount < 22){
			offensivePlayers[offensiveCount] = new OffensivePlayer();
			offensivePlayers[offensiveCount].setGenerics(
					playerCreation.generatePlayerName(), 
					playerCreation.generatePosition("offensive"), 
					playerCreation.generateGamesPlayed(), 
					playerCreation.generateYearsPlayed());
				offensivePlayers[offensiveCount].setYards(
						playerCreation.generateYards("rush"), 
						playerCreation.generateYards("passing"), 
						playerCreation.generateYards("recieving"), 
						playerCreation.generateYards("kicking"));
				offensivePlayers[offensiveCount].setOffense1(
						playerCreation.generateLowStat(), 
						playerCreation.generateLowStat(), 
						(int)playerCreation.generateYards("kickReturns"), 
						playerCreation.generateLowStat());
				offensivePlayers[offensiveCount++].setOffense2(
						(playerCreation.generateLowStat() * 2),
						playerCreation.generateLowStat(),
						playerCreation.generateLowStat(),
						playerCreation.generateLowStat());
		}
		while (defensiveCount < 22){
			defensivePlayers[defensiveCount] = new DefensivePlayer();
			defensivePlayers[defensiveCount].setGenerics(
					playerCreation.generatePlayerName(), 
					playerCreation.generatePosition("defensive"), 
					playerCreation.generateGamesPlayed(), 
					playerCreation.generateYearsPlayed());
			defensivePlayers[defensiveCount++].setDefensiveStats(
					playerCreation.generateTackles(),
					playerCreation.generateTackleAssists(),
					playerCreation.generateLowStat());
		}
	}
	
	protected void displayPlayers(String type){
		if (type.equals("offensive")){
			int x = 0;
			while (x < 22){
				System.out.println(offensivePlayers[x++].getName());
			}
		}
		else if (type.equals("defensive")){
			int x = 0;
			while (x < 22){
				System.out.println(defensivePlayers[x++].getName());
			}
		}
		else
			System.out.println("Error.");
	}
}
