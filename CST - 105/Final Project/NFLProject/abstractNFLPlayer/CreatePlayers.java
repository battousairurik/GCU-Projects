package abstractNFLPlayer;

import java.util.Random;

public class CreatePlayers {
	
	protected CreatePlayers(){	}
	
	protected String[] offensivePositions = {"Quarterback", "Runningback", "Fullback", 
			 "Offensive Line Left Tackle", "Offensive Line Left Guard", "Offensive Line Center", 
			 "Offensice Line Right Guard", "Offensice Line Right Tackle", "Tight End", 
			 "Wide Reciever 1", "Wide Reciever 2"};
	protected String[] defensivePositions = {"Defensive End Left", "Defensive Tackle", "Defensive End Right", 
			 "Outside Linebacker Left", "Middle Linebacker", "Ourside Linebacker Right", 
			 "Cornerback Left", "Cornerback Middle", "Cornerback Right", "Strong Safety", "Free Safety"};
	protected String[] availableTeams = {""};
	
	protected int offensiveCreationCount = 0;
	protected int defensiveCreationCount = 0;
	
	protected String generatePosition(String position){
		if (position == "offensive"){
			return offensivePositions[offensiveCreationCount++];
		}
		else if (position == "defensive"){
			return defensivePositions[defensiveCreationCount++];
		}
		else{
			System.out.println("Error.");
			return null;
		}
	}
	protected void resetCounts(){
		this.offensiveCreationCount = 0;
		this.defensiveCreationCount = 0;
	}
	
	protected String generatePlayerName(){
		return generateFirstName() + " " + generateLastName();
	}
	private Random r1 = new Random();
	protected String generateFirstName(){
		int x = r1.nextInt(9);
		String name = " ";
		switch (x){
		case 0: name = "Bronko"; break;
		case 1: name = "Bo"; break;
		case 2: name = "O.J."; break;
		case 3: name = "Johnny"; break;
		case 4: name = "Plaxico"; break;
		case 5: name = "D’Brickashaw"; break;
		case 6: name = "Merlin"; break;
		case 7: name = "John"; break;
		case 8: name = "Y.A."; break;
		}
		return name;
	}
	protected String generateLastName(){
		int x = r1.nextInt(9);
		String name = " ";
		switch (x){
		case 0: name = "Nagurski"; break;
		case 1: name = "Jackson"; break;
		case 2: name = "Simpson"; break;
		case 3: name = "Unitas"; break;
		case 4: name = "Burress"; break;
		case 5: name = "Ferguson"; break;
		case 6: name = "Olsen"; break;
		case 7: name = "Riggins"; break;
		case 8: name = "Tittle"; break;
		}
		return name;
	}
	private int years = 0;
	private int games = 0;
	private int x = 0;
	protected int generateYearsPlayed(){
		years = r1.nextInt(6) + 1;
		return years;
	}
	protected int generateGamesPlayed(){
		int x = years;
		while (x > 0){
			games += (r1.nextInt(9) + 8);
			x--;
		}
		return games;
	}
	protected int generateTackles(){
		x = 0;
		int y = games;
		while (y > 0){
			x += (r1.nextInt(2) + 1);
			y--;
		}
		return x;
	}
	protected int generateTackleAssists(){
		x = 0;
		int y = games;
		while (y > 0){
			x += r1.nextInt(2);
			y--;
		}
		return x;
	}
	protected int generateLowStat(){
		x = 0;
		int y = games;
		while (y > 0){
			x += r1.nextInt(2);
			y--;
		}
		if (x > 1)
			x--;
		return x;
	}
	private double yards = 0;
	protected double generateYards(String type){
		yards = 0;
		int y = games;
		while (y > 0){
			yards += (r1.nextInt(21) + 10);
			y--;
		}
		if (type.equals("passing")){
			yards += (r1.nextInt(200) + 51);
		}
		return yards;
	}
}
