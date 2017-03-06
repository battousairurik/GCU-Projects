
public class NFLPlayer 
{
	String playerName = "";
	String playerPosition = "";
	
	int gamesPlayed = 0;
	double totalYards = 0;
	
	double passingYards = 0;
	double rushingYards = 0;
	double recievingYards = 0;
	double kickingYards = 0;
	
	int interceptionsThrown = 0;
	int fieldGoals = 0;
	int kickReturns = 0;
	int punts = 0;
	int sacks = 0;
	int touchDowns = 0;
	int timesTackled = 0;
	int fumbles = 0;
	
	int tackles = 0;
	int tackleAssists = 0;
	int interceptionsCaught = 0;
	
	public NFLPlayer (String name, String position)
	{
		playerName = name;
		playerPosition = position;
	}
	public void setGenerics(int games, double yards)
	{
		gamesPlayed = games;
		totalYards = yards;
	}
	public void setYards (double passing, double rushing, double recieving, double kicking)
	{
		passingYards = passing;
		rushingYards = rushing;
		recievingYards = recieving;
		kickingYards = kicking;
	}
	public void setOffense1 (int thrown, int goals, int returns, int punt)
	{
		interceptionsThrown = thrown;
		fieldGoals = goals;
		kickReturns = returns;
		punts = punt;
	}
	public void setOffense2 (int sack, int td, int tackle, int fumble)
	{
		sacks = sack;
		touchDowns = td;
		timesTackled = tackle;
		fumbles = fumble;
	}
	public void setDefense (int tackle, int assists, int interceptions)
	{
		tackles = tackle;
		tackleAssists = assists;
		interceptionsCaught = interceptions;
	}
	public void printPlayer ()
	{
		System.out.println("Player: " + playerName);
		System.out.println("Position: " + playerPosition);
		System.out.println("Total Games: " + gamesPlayed);
		System.out.println("Total Yards: " + totalYards);
		System.out.println("Passing: " + passingYards);
		System.out.println("Rushing: " + rushingYards);
		System.out.println("Recieving: " + recievingYards);
		System.out.println("Kicking: " + kickingYards);
		System.out.println("IntThr: " + interceptionsThrown);
		System.out.println("FG: " + fieldGoals);
		System.out.println("KR: " + kickReturns);
		System.out.println("Punts: " + punts);
		System.out.println("Sacks: " + sacks);
		System.out.println("TD: " + touchDowns);
		System.out.println("Tackled: " + timesTackled);
		System.out.println("Fumbles: " + fumbles);
		System.out.println("Tackles: " + tackles);
		System.out.println("TA: " + tackleAssists);
		System.out.println("IntCaught: " + interceptionsCaught);
	}
}
